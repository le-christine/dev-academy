package com.household;

public class Cat implements PetActivities {

    @Override
    public void makeSound() {
        System.out.println("Meow meow meow...");
    }

    @Override
    public void feed() {
        System.out.println("Feeding...");
    }

    @Override
    public void play() {
        System.out.println("Chasing a ball of yarn...");
    }

    @Override
    public void groom() {
        System.out.println("Grooming...");
    }
}

