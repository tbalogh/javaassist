package com.logmein.qna.task4;

/**
 * Created by bbanyai on 3/9/18.
 */
public class Motorcycle {

    Engine engine;
    Wheel wheel;

    public Motorcycle(Engine engine, Wheel wheel) {
        this.engine = engine;
        this.wheel = wheel;
    }

    public static class Builder {

        Engine engine;
        Wheel wheel;

        public Builder engine(Engine engine) {
            this.engine = engine;
            return this;
        }

        public Builder wheel(Wheel wheel) {
            this.wheel = wheel;
            return this;
        }

        public Motorcycle build() {
            return new Motorcycle(engine, wheel);
        }

    }

}
