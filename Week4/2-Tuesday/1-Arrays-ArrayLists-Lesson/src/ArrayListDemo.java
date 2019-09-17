import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String arg[]) {
        // ArrayList is a collection of a type of data
        ArrayList<String> books = new ArrayList<>();
        books.add("C++");
        books.add("Python");
        books.add("Java");
        books.add("MongoDB");
        books.add("JavaScript");
        books.add("MySQL");
        System.out.println(books);
        books.remove(3);
        System.out.println(books);
    }
}
