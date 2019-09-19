package creatures;

public class Animal {
    // initalize instance variables
    private String name;
    private int topSpeed;
    private int numLegs;
    private boolean isEndangered;

    // constructor
    public Animal(String name, int topSpeed,
                  int numLegs, boolean isEndangered) {
        this.name = name;
        this.topSpeed = topSpeed;
        this.numLegs = numLegs;
        this.isEndangered = isEndangered;
    }


    public String getName(){
        return name;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public int getNumLegs() {
        return numLegs;
    }

    public boolean getIsEndangered() {
        return isEndangered;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public void setNumLegs(int numLegs) {
        this.numLegs = numLegs;
    }

    public void setIsEndangered(boolean isEndangered) {
        this.isEndangered = isEndangered;
    }

    public String introduce() {
        String introduction = "Hello I am " + this.getName() + " and I have " + this.getNumLegs() + " legs and a top speed of " +
                this.getTopSpeed();
        return introduction;
    }

}

