public class Sample {
    // static int mySum = 0;
    int mySum = 0;

    public static void main(String[] args) {
        int value = getSum();
        /* mySum = getSum(); =>
        cannot do this because getSum() is a static method
        mySum belongs to the Object, mySum is private by default */

        // mySum = getSum();
        System.out.println(value);
    }

    /**
     * Method getSum()
     */
    public static int getSum() {
        int sum = 2 + 2;
        return sum;
    }

    
}
