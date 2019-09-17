import java.util.HashMap;

public class LinkedLists {
    public static void main(String args[]) {
        // HashMap similar to object, has key value pairs
        HashMap<String, String> studentMap = new HashMap<String, String>();

        studentMap.put("195abc", "Mabel");
        studentMap.put("542jjjk", "Kareem");

        System.out.println(studentMap.get("195abc"));
    }
}

