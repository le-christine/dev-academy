import java.util.HashMap;

public class LinkedLists {
    public static void main(String args[]) {
        HashMap<String, String> dict = new HashMap<String, String>();

        dict.put("apple", "a fruit from a tree");
        dict.put("lake", "a large body of water");

        System.out.println(dict.get("apple"));
    }
}

