package example.Interface2;

public class Tire implements Moveable, Rollable {
    int width;
    public boolean isRollable() {
        return true;
    };

    public boolean isMoveable() {
        return true;
    }

    public static void main(String[] args) {
        Tire tire = new Tire();
        System.out.println(tire.isMoveable());
        System.out.println(tire.isRollable());
    }
}
