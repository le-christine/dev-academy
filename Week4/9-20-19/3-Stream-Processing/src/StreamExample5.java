import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamExample5 {
    public static void main(String args[]) {
        Stream<Integer> numbers = Stream.of(5,10);
        // The reduce() method reduces the array to a single value
        // reduce returns an Optional

        Optional<Integer> intOptional = numbers.reduce((i, j) -> {
           return i+10;
        });

        if(intOptional.isPresent()) {
            System.out.println("Mul " + intOptional.get());
        }

        Stream<Integer> numberStudents = Stream.of(1,2,3,4,5);
        System.out.println(numberStudents.count());

        //efficient bc you are reading an integer stream but returning a boolean
        Stream<Integer> numberDogs = Stream.of(1,2,3,6,10);
        System.out.println(numberDogs.anyMatch(integer -> integer == 2));

        Stream<Integer> numbersCats = Stream.of(1,2,3,4,5);
        System.out.println(numbersCats.anyMatch(value -> value <3));

        Stream<List<String>> names = Stream.of(
                Arrays.asList("John"),
                Arrays.asList("Mike"),
                Arrays.asList("Smith", "Melvin", "Joe")
        );

        Stream<String> flatStream = names.flatMap(strList -> strList.stream());
        flatStream.forEach(System.out::println);
        /*
        flatStream.forEach(value -> {
            System.out.println(value);
        });
        */

    }
}
