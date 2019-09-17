import java.util.HashMap;
import java.util.LinkedList;

public class LinkedLists {
    public static void main(String args[]) {
        // Create a linkedlist of strings with the values
        // "One" "two" "three" "four"
        LinkedList<String> numbers = new LinkedList<String>();
        numbers.add("one");
        numbers.add("two");
        numbers.add("three");
        numbers.add("four");
        System.out.println(numbers);

        // Create a HashMap "one" -> 1, "two" -> 2.... 4
        // Print out the size and hashmap

        HashMap<String, Integer> numbersMap = new HashMap<String, Integer>();
        numbersMap.put(numbers.get(0), 1);
        numbersMap.put(numbers.get(1), 2);
        numbersMap.put(numbers.get(2), 3);
        numbersMap.put(numbers.get(3), 4);

        System.out.println(numbersMap.size());
        System.out.println(numbersMap);
        
    }
}

