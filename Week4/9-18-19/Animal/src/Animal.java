public class Animal {
    //Put instance variables here
    private int numLegs;
    private int topSpeed;
    private boolean isEndangered;
    private String name;

    //Put constructor here
    public Animal(int numLegs, int topSpeed, boolean isEndangered, String name) {
        this.numLegs = numLegs;
        this.topSpeed = topSpeed;
        this.isEndangered = isEndangered;
        this.name = name;
    }
    public Animal() {

    }

    //Put getters and setters here
    public void setNumLegs(int numLegs) {
        this.numLegs = numLegs;
    }

    public int getNumLegs() {
        return this.numLegs;
    }

    public void setEndangered(boolean endangered) {
        this.isEndangered = endangered;
    }

    public boolean getEndangered() {
        return this.isEndangered;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public int getTopSpeed() {
        return this.topSpeed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    /* bonus
    Introduce method returns a formatted String using the class properties
     */

    public String introduce() {
        String output = String.format("The %s has %d legs and a top speed of %d mph.",
                this.name, this.numLegs, this.topSpeed);
        return output;
    }


    public static void main(String[] args) {
        // System.out.println("Hello, world");
        //Instantiate new Animal
        Animal animal = new Animal() ;

        String name;
        animal.setName("Elephant");
        int topSpeed;
        animal.setTopSpeed(25);

        //get name and speed values using getters
        name =  animal.getName();
        topSpeed = animal.getTopSpeed();

        //Print some output
        System.out.println("The " + name + " has a top speed of " +
                topSpeed + " mph.");

        //Set new name, speed, and endangered properties values using setters
        animal.setName("Lion");
        animal.setTopSpeed(50);
        animal.setNumLegs(4);
        animal.setEndangered(true);

        //get new values using getters
        name = animal.getName();
        topSpeed = animal.getTopSpeed();

        //Print some output
        System.out.println(animal.introduce());
    }
}