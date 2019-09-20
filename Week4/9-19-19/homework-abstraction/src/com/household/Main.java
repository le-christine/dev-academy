package com.household;

public class Main {
    public static void main(String[] args) {
        christineHouse();
        System.out.println();
        jHouse();
    }

    public static void christineHouse() {
        House christineCrib = new House();
        Cat bubbas = new Cat();

        System.out.println("Christine comes home from work. TGIF, and payday!");
        christineCrib.earnIncome(2400);
        christineCrib.netIncome();
        System.out.println(christineCrib.introduce());
        System.out.println("Christine plays with the pet");
        bubbas.play();
        bubbas.makeSound();
        System.out.println("Christine feeds the pet");
        bubbas.feed();
        System.out.println("Christine brushes the pet");
        bubbas.groom();
        System.out.println("The next morning Christine sells some items.");
        christineCrib.earnIncome(100);
        christineCrib.netIncome();
        System.out.println(christineCrib.introduce());
        System.out.println("Happy Pet, Happy Life.");

    }

    public static void jHouse() {
        House jHouse = new House();
        Dog pal = new Dog();

        System.out.println("J comes home from work. TGIF, and payday!");
        jHouse.earnIncome(2400);
        jHouse.netIncome();
        System.out.println(jHouse.introduce());
        System.out.println("J plays with the pet");
        pal.play();
        pal.makeSound();
        System.out.println("J feeds the pet");
        pal.feed();
        System.out.println("J brushes the pet");
        pal.groom();
        System.out.println("The next morning J sells some items.");
        jHouse.earnIncome(100);
        jHouse.netIncome();
        System.out.println(jHouse.introduce());
        System.out.println("Happy Pet, Happy Life.");

    }
}

