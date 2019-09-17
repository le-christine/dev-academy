import java.util.Arrays;

public class ArrayDemo {
    public static void main(String args[]) {
        int[] primeNumbers = {5, 3, 11, 10, 7, 2};
        int[] primeNumbers2 = primeNumbers.clone();

        // Arrays is a class, toString is a method
        System.out.println(Arrays.toString(primeNumbers));
        String numbers = Arrays.toString(primeNumbers);
        // getClass will tell you type of data structure
        // System.out.println(numbers.getClass());


        // Search for a number in the array- sort and binarySearch
        Arrays.sort(primeNumbers);

        for(int x=0; x<primeNumbers.length; x++) {
            System.out.println(primeNumbers[x]);
        }

        int indexOf10 = Arrays.binarySearch(primeNumbers, 10);

        System.out.println("Index of 10: " + indexOf10);
    }
}
