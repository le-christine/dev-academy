import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedLists {
    public static void main(String args[]) {
        /*
        ArrayList<String> myList = new ArrayList<>();

        myList.add("Cookies!");
        myList.add("Ice cream!");

        String[] cookieFlavors = new String[]{"Chocolate Chip", "Oatmeal Raisin"};
        List<String> stringcookieFlavors = Arrays.asList(cookieFlavors);
         */
        
        LinkedList<String> iceCreamFlavors = new LinkedList<>();

        iceCreamFlavors.add("Oreo");
        iceCreamFlavors.add("Cherry Garcia");

        LinkedList<Integer> quizPoints = new LinkedList<Integer>();
        quizPoints.add(90);
        quizPoints.add(85);
        quizPoints.add(40);
        quizPoints.add(60);
        quizPoints.add(70);
        System.out.println(quizPoints);

        quizPoints.remove(2);
        quizPoints.removeFirst();
        System.out.println(quizPoints);
    }
}

