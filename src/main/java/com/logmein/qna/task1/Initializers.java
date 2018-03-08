package com.logmein.qna.task1;

/**
 * Created by bbanyai on 3/8/18.
 */
public class Initializers {

    public static void main(String... args) throws ClassNotFoundException {

        Class theClass = Class.forName("com.logmein.qna.task1.Apple", false, ClassLoader.getSystemClassLoader());

        System.out.println("nothing is ran yet");

        Class initializedClass = Class.forName("com.logmein.qna.task1.Apple");

        new Apple();

    }



}
