package creatures;

public class Lizard extends Reptile {
    private String name;
    private int topSpeed;
    private int numLegs;
    private boolean isEndangered;
    private boolean isColdBlooded;
    private boolean producesAmnioticEgg;

    public Lizard(String name,
                  int topSpeed,
                  int numLegs,
                  boolean isEndangered,
                  boolean isColdBlooded,
                  boolean producesAmnioticEgg) {
        super(name, topSpeed, numLegs, isEndangered, isColdBlooded);
        this.producesAmnioticEgg = producesAmnioticEgg;
    }
}
