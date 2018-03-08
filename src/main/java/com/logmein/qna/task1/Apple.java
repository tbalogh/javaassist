package com.logmein.qna.task1;

/**
 * Created by bbanyai on 3/8/18.
 */
public class Apple {

    static {
        System.out.println("i am a static initializer");
    }

    {
        System.out.println("i am 'like' a constructor");
    }

    public Apple() {
        System.out.println("i am a real constructor");
    }

}
