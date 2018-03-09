package com.logmein.qna.task4;

/**
 * Created by bbanyai on 3/9/18.
 */
public class NestedManual {

    public static void main(String... args) {
        Motorcycle hayabusa = new Motorcycle.Builder()
                .engine(new I4Engine())
                .wheel(new ForgedWheel())
                .build();
    }

}
