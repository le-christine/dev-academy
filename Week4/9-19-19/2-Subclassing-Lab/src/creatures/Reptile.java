package creatures;

public class Reptile extends Animal {
    private String name;
    private int topSpeed;
    private int numLegs;
    private boolean isEndangered;
    private boolean isColdBlooded;

    public Reptile(String name,
                   int topSpeed,
                   int numLegs,
                   boolean isEndangered,
                   boolean isColdBlooded) {
        super(name, topSpeed, numLegs, isEndangered);
        this.isColdBlooded = isColdBlooded;
    }
}
