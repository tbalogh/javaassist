package com.logmein.qna.task1;

/**
 * Created by bbanyai on 3/8/18.
 */
public class BirsPear extends Pear {

    static void printFruitStatic() {
        System.out.println("StaticBirsPear");
    }

    @Override
    void printFruit() {
        System.out.println("BirsPear");
    }

}
