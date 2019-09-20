package com.household;

class Dog implements PetActivities {

    @Override
    public void makeSound() {
        System.out.println("Woof woof woof...");
    }

    @Override
    public void feed() {
        System.out.println("Feeding...");
    }

    @Override
    public void play() {
        System.out.println("Fetching the ball...");
    }

    @Override
    public void groom() {
        System.out.println("Grooming...");
    }
}
