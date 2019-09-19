package creatures;

public class Bear extends Mammal {
    private String name;
    private int topSpeed;
    private int numLegs;
    private boolean isEndangered;
    private boolean isWarmBlooded;
    private boolean hasMolars;

    public Bear (String name,
                  int topSpeed,
                  int numLegs,
                  boolean isEndangered,
                  boolean isWarmBlooded,
                  boolean hasMolars) {
        super(name, topSpeed, numLegs, isEndangered, isWarmBlooded);
        this.hasMolars = hasMolars;
    }
}
