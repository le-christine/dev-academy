package com.example;


// we should use interfaces when using lambda,
// but separate them!
interface Compute {
    int operation(int a, int b); // force to overwrite / specify the body when implemented
}

public class LambdaExpressionDemo {
    public static void main(String[] args) {
        // similiar to arrow function in JS
        // here we call them lambda functions
        // add is a Compute method which accepts a,b and
        // returns a + b
        Compute add = (a,b) ->  a + b;
        System.out.println("5 + 6 = " + add.operation(5,6));

        Compute sub = (a,b) -> a-b;
        System.out.println("10 - 1 = " + sub.operation(10,1));

    }
}
