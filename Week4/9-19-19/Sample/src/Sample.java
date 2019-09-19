public class Cat {
    // public final class Cat -> will not allow anybody to extend the class
    private String name;

    // If we have private objects we need setters and getters
    public String getName(){
        return this.name;
    }

    public void setName(name) {
        this.name = name;
    }

    public boolean hasWhiskers(){
        return true;
    }

    // can use final on the method itself to not allow Override
    protected String favoriteSnack(){
        return "Mice";
    }

    public int numLives() {
        return 9;
    }
}

// Lion has access to everything that is not private in the Cat class (e.g. numLives, hasWhiskers, getName, setName)
class Lion extends Cat {
    // doesn't add functionality
    // if you change the name of numLives() in the parent method this tells the compiler to override the change
    // debugger help
    @Override
    public int numLives(){
        return 1;
    }

}

public static void main(String args[]) {
    Lion casey = new Lion();
    System.out.println(casey.hasWhiskers()); // true
    System.out.println(casey.favoriteSnack()); // Mice
    System.out.println(casey.numLives()); // 1

    Cat suresh = new Cat();
    System.out.println(suresh.numLives()); // 9

    Cat mary = new Lion();
    System.out.println(mary.numLives()); //1

    // Lion michael = new Cat(); ClassCastException - parents cannot get the qualities of the children bc
    // the compiler cannot mitigate the different attributes
    Lion michael = new (Lion)Cat;

}
