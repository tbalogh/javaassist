package com.logmein.qna.task12;

import java.util.concurrent.*;

/**
 * Created by bbanyai on 3/8/18.
 */
public class WithExecutors {

    public static void main(String... args) throws ClassNotFoundException {

        ExecutorService e = Executors.newSingleThreadExecutor();
        Future f = e.submit(WithExecutors::veryLongOperation);
        try {
            f.get(2, TimeUnit.SECONDS);
        } catch (InterruptedException | ExecutionException e1) {
            e1.printStackTrace();
        } catch (TimeoutException e1) {
            f.cancel(true);
            System.out.println("task did not complete within given time");
        }

    }

    private static void veryLongOperation() {

        try {
            System.out.println("started operation");
            Thread.sleep(5000);
            System.out.println("operation completed");
        } catch (InterruptedException e) {
            System.out.println("operation interrupted");
            e.printStackTrace();
        }

    }

}
