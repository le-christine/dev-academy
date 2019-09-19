package FinalExample;

public class Wife extends Person {
    /**
     *
     * @param n
     */
    Wife(String n){
        super(n);
        name = "Wife " + n;
    }

    void call() {
        System.out.println("Ring ring...");
    }
}
