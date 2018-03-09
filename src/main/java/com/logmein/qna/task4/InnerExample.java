package com.logmein.qna.task4;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * Created by bbanyai on 3/9/18.
 */
public class InnerExample {

    private String name;

    public InnerExample(String name) {
        this.name = name;
    }

    private class InnerGreeter implements Runnable {

        @Override
        public void run() {
            System.out.println("Greetings "+name);
        }
    }

    private static class NestedGreeter implements Runnable {

        @Override
        public void run() {
            // ERROR: System.out.println("Greetings "+name);
             System.out.println("Greetings nested");
        }
    }

    public static void main(String... args) {


        Executor e = Executors.newSingleThreadExecutor();

        e.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("Greetings anonymous");
            }
        });

        InnerExample example = new InnerExample("Tomi");
        e.execute(example.new InnerGreeter());
        // ERROR: e.execute(new InnerGreeter());


        e.execute(new NestedGreeter());

    }

}
