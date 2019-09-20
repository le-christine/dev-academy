package com.example;

interface HelloWorld{
    public void greet(String s, String l);
}
public class LambdaExpressionDemo2 {
    public static void main(String[] args) {
        // easier to define the abstract methods with lambda function
        HelloWorld greeting = (String f, String l) -> {
            System.out.println("Welcome " + f + " " + l);
        };
        greeting.greet("John", "Smith");
        greeting.greet("Mike", "Doe");
    }
}
