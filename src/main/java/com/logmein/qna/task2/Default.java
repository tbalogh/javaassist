package com.logmein.qna.task2;

import lombok.extern.java.Log;

import java.util.function.Supplier;

/**
 * Created by bbanyai on 3/9/18.
 */
public class Default {

    interface Login {

        void enterUsername();
        void enterPassword();
        void enter2FA();
        default void enter3FA() {}
    }

    class BaseLogin implements Login {

        @Override
        public void enterUsername() {
            throw new RuntimeException();
        }

        @Override
        public void enterPassword() {
            throw new RuntimeException();
        }

        @Override
        public void enter2FA() {

        }
    }

    class AndroidLogin extends BaseLogin {

        @Override
        public void enterUsername() {

        }

        @Override
        public void enterPassword() {

        }

    }

    class IosLogin extends BaseLogin {

        @Override
        public void enterUsername() {

        }

        @Override
        public void enterPassword() {

        }
    }

    public static void main(String... args) {



    }








































    private static int adder(Supplier<Integer> a, Supplier<Integer> b) {
        return a.get() + b.get();
    }
}
