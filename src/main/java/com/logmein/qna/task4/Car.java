package com.logmein.qna.task4;


import lombok.Builder;
import lombok.Getter;

/**
 * Created by bbanyai on 3/9/18.
 */
@Builder
@Getter
public class Car {

    private Wheel wheel;
    private Engine engine;

    private String numberPlate;

}
