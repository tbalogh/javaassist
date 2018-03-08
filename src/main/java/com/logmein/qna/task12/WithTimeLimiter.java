package com.logmein.qna.task12;

import com.google.common.util.concurrent.SimpleTimeLimiter;
import com.google.common.util.concurrent.UncheckedTimeoutException;

import java.util.concurrent.*;

/**
 * Created by bbanyai on 3/8/18.
 */
public class WithTimeLimiter {
    
    public static void main(String... args) throws Exception {

        try {
            new SimpleTimeLimiter().callWithTimeout(WithTimeLimiter::veryLongOperation, 2, TimeUnit.SECONDS, true);
        } catch (UncheckedTimeoutException e) {
            System.out.println("task did not complete within given time");
        }

    }


    private static Void veryLongOperation() {

        try {
            System.out.println("started operation");
            Thread.sleep(5000);
            System.out.println("operation completed");
        } catch (InterruptedException e) {
            System.out.println("operation interrupted");
            e.printStackTrace();
        }
        return null;
    }

}
