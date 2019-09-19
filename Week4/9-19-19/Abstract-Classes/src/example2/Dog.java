package example2;

// public class Dog extends Animal
public class Dog extends Animal {
    // sound() method is abstractly defined in class
    public void sound() {
        System.out.println("Making a sound");
    }

    public void eat() {
        System.out.println("I like peanut butter.");
    }

    public static void main(String args[]) {
        Dog d = new Dog();
        d.sound();
        d.eat();
    }
}
