import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample4 {
    public static void main(String[] args) {
        Stream<String> names2 = Stream.of("aBc", "d", "ef", "12345");
        // take the reverse order
        // collect and convert to list
        // list is sorted
        List<String> reversedSorted = names2.sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(reversedSorted);

        Stream<String> names3 = Stream.of("aBc", "d", "ef", "12345");
        List<String> natural = names3.sorted().collect(Collectors.toList());
        System.out.println(natural);

    }
}
