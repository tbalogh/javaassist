package com.logmein.qna.task10;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by bbanyai on 3/8/18.
 */
public class Finally {

    public static void main(String... args) {
        oldStyle();
        newStyle();
    }

    private static void oldStyle() {
        InputStream is = new ByteArrayInputStream(new byte[0]);
        try {
            is.read();
        } catch (IOException e) {

        } finally {
            try {
                is.close();
            } catch (IOException e) {

            }
        }
    }


    private static void newStyle() {
        try(InputStream is = new ByteArrayInputStream(new byte[0])) {
            is.read();
        } catch (IOException e) {

        }
    }


}
