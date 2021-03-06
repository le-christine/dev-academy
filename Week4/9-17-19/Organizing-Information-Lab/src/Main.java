import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Nothing in the main method will be tested
    }

    /**
     * Question 1: Find the smallest and largest numbers in an array
     *
     * You are given an array of integers, with at least two values.
     * Find the smallest and largest numbers in the array, and pass them back in an array containing two values,
     * the largest and smallest.
     *
     * You MAY ONLY use arrays, not other collections types (ie Lists).
     *
     * YOU CAN'T USE A SORTING METHOD BUILT INTO JAVA
     *
     * @param array An array of integers with at least two values
     * @return An array of integers with two elements, the largest and smallest from the method parameter
     */
    public static int[] findLargestAndSmallest(int[] array){
        int minNum = array[0];
        int maxNum = array[0];

        for (int num: array) {
            minNum = (minNum < num) ? minNum: num;
            maxNum = (maxNum > num) ? maxNum : num;
        }
        int[] minAndMaxArray = new int[2];
        minAndMaxArray[0] = minNum;
        minAndMaxArray[1] = maxNum;
    return minAndMaxArray;
    }


    /**
     * Question 2: Remove duplicates from an array
     *
     * You are given an array of ints that might have duplicates. You must remove any duplicates from the array,
     * and return an array that doesn't contain duplicates. The order of the elements in the original array
     * does not need to be kept the same.
     *
     * You MAY use any collections types you wish, but the method must return an array.
     *
     * Example: [1,4,3,2,1] would return, in any order, [1,2,3,4]
     *
     * @param array An array of ints that may or may not include duplicates
     * @return An array of ints that doesn't contain duplicates.
     */
    public static Object[] removeDuplicatesFromArray(int[] array){
        ArrayList<Integer> newArr = new ArrayList<Integer>();
        for (int num: array) {
            if (!newArr.contains(num)) {
                newArr.add(num);
            }
        }
        return newArr.toArray();
    }

    /**
     * Given an array of integers, return the sum of the two largest values.
     *
     * If the array is empty, return 0.
     * If the array has one value, return that value.
     *
     * YOU CAN'T USE A SORTING METHOD BUILT INTO JAVA
     *
     * @param array An array of integers of any size.
     * @return Sum of the two largest values
     */

    public static int sumOfTwoLargest(int[] array){

        int maxNum = 0;
        int secondMaxNum = 0;

        for (int num : array) {
            maxNum = num > maxNum ? num : maxNum;
            secondMaxNum = num > secondMaxNum ? num: secondMaxNum;
        }

        return maxNum += secondMaxNum;


        /* using sort
        Arrays.sort(array);

        if (array.length == 0) {
            return 0;
        } else if (array.length == 1) {
            return array[0];
        } else {
            return array[array.length - 1] + array[array.length - 2];
        }
        */

    }



    //BONUS QUESTION IS BELOW

    /**
     * BONUS:
     *
     * Given two sorted arrays of integers, return a sorted array of the two original arrays merged together.
     * All valid numbers in these arrays are greater than 0.
     *
     * array1 has enough empty space (represented by the value 0) to hold all valid values from the original two arrays
     * combined. The returned array must be array1 with the new values merged in.
     *
     * For example:
     *      array1 = [1,4,7,9,0,0,0]
     *      array2 = [1,5,11]
     *      returned array = [1,1,4,5,7,9,11]
     *
     * No test cases are provided for this method, you will need to test it on your own.
     *
     * @param array1 Array of sorted integers
     * @param array2 Array of sorted integers
     * @return Array of sorted integers, merged from array1 and array2
     */
    public static int[] mergeSortedArrays(int[] array1, int[] array2){
        return null;
    }
}