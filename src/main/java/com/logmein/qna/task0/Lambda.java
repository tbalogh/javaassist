package com.logmein.qna.task0;

import java.util.function.Supplier;

/**
 * Created by bbanyai on 3/9/18.
 */
public class Lambda {

    public static void main(String... args) {

        Supplier<Integer> sup = Lambda::getA;

        int sum = adder(Lambda::getA, sup);
        System.out.println(sum);

    }

    private static Integer getA() {
        return 42;
    }








































    private static int adder(Supplier<Integer> a, Supplier<Integer> b) {
        return a.get() + b.get();
    }
}
