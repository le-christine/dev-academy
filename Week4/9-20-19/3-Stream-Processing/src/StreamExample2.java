import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample2 {
    public static void main(String[] args) {
        Stream<Integer> integerStream = Stream.of(1,2,3,4,5);
        List<Integer> intList = integerStream.collect(Collectors.toList());
        System.out.println(intList); // prints [1, 2, 3, 4, 5]

        integerStream = Stream.of(1,2,3,4);
        // making a map
        // collect integerStream k,v
        // assign i to k and i+10 to v
        Map<Integer, Integer> integerMap = integerStream.collect(Collectors.toMap(i -> i, i->i+10));
        System.out.println(integerMap); // prints {1=11, 2=12, 3=13, 4=14}
    }
}
