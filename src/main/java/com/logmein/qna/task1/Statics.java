package com.logmein.qna.task1;

public class Statics {

    public static void main(String... args) throws ClassNotFoundException {

        Pear pear = new Pear();
        pear.printFruit();
        pear.printFruitStatic();
        pear = new BirsPear();
        pear.printFruit();
        pear.printFruitStatic();

    }

}
