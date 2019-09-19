package creatures;

public class Mammal extends Animal {
    private String name;
    private int topSpeed;
    private int numLegs;
    private boolean isEndangered;
    private boolean isWarmBlooded;

    public Mammal(String name, int topSpeed,
                  int numLegs, boolean isEndangered,
                  boolean isWarmBlooded) {
        super(name, topSpeed, numLegs, isEndangered);
        this.isWarmBlooded = isWarmBlooded;
    }

}
