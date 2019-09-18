public class Main {
    public static void main(String args[]) {
        int[] anArray; // unknown size array declaration
        anArray = new int[10]; // assigning length 10 to anArray

        anArray[0] = 10;
        anArray[1] = 20;
        anArray[3] = 30;
        anArray[4] = 40;
        anArray[9] = 100;

        // System.out.println(anArray[2]); => default is 0
        anArray[2] = 100;
        System.out.println(anArray[2]);
        // System.out.println(anArray); => would give you an encrypted JVM address so the actual memory address is secure
    }
}
