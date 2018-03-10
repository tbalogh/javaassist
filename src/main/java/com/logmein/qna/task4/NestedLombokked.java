package com.logmein.qna.task4;

/**
 * Created by bbanyai on 3/9/18.
 */
public class NestedLombokked {

    public static void main(String... args) {

        Car car = new Car.CarBuilder()
                .engine(new V8Engine())
                .wheel(new ForgedWheel())
                .build();

        car.getNumberPlate();


    }

}
