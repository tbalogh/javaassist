package com.logmein.qna.task10;

/**
 * Created by bbanyai on 3/8/18.
 */
public class ExceptionHandling {

    private static class CheckedException extends Exception {
        // Must be caught
    }

    private static class UncheckedException extends RuntimeException {
        // Can be caught
    }

    private static class SeriousError extends Error {
        // can be caught
    }

    private static class GodThrowable extends Throwable {
        // must be caught
    }

    public static void main(String... args) {


        try {
            throw new CheckedException();
        } catch (Exception e) {
            System.out.println("caught "+e.getClass().getSimpleName());
        }

        try {
            throw new UncheckedException();
        } catch (Exception e) {
            System.out.println("caught "+e.getClass().getSimpleName());
        }

        try {
            throw new SeriousError();
        } catch (Throwable e) {
            System.out.println("caught throwable "+e.getClass().getSimpleName());
        }

        try {
            throw new GodThrowable();
        } catch (Throwable e) { // MUST!
            System.out.println("caught "+e.getClass().getSimpleName());
        }
    }


}
