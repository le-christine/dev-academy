package creatures;

public class Main {
    public static void main(String[] args) {
        Animal shark = new Animal("Sharky", 31, 0, false);
        Mammal cow = new Mammal("cow", 25, 4, false, true);
        Reptile turtle = new Reptile("chameleon", 20, 4, false, true);
        Bear aBear = new Bear ("Brown bear",30, 4, false, true,true);
        Lizard aLizard = new Lizard ("Lizard", 21, 4, true, true, false);

        System.out.println(shark.introduce());
        System.out.println(cow.introduce());
        System.out.println(turtle.introduce());
        System.out.println(aBear.introduce());
        System.out.println(aLizard.introduce());
    }

}
