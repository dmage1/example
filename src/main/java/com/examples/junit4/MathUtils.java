package com.examples.junit4;

class MathUtils {
    static int multiply(int x, int y) {
        // the following is just an example
        if (x > 999) {
            throw new IllegalArgumentException("X should be less than 1000");
        }
        return x * y;
    }

    static int divide (int x, int y) {
        // the following is just an example
        if (y == 0) {
            throw new ArithmeticException("Y should not be 0");
        }
        return x / y;
    }

    static int add (int x, int y) {
        return x + y;
    }

}
