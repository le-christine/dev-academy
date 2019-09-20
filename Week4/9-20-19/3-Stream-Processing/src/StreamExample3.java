import java.util.Arrays;
import java.util.stream.Stream;

public class StreamExample3 {
    public static void main(String[] args) {
        // A stream is NOT an object
        // The Stream API is used to process collections of objects.
        // A stream is not a data structure instead it takes input from the Collections, Arrays or I/O channels.
        // a stream will read a file -> it will just move the info to a stream in memory
        // cuts access to the file - a stream is a temporary object
        Stream<Integer> integerStream = Stream.of(1,2,3,4);

        // a pipeline
        // lambda chain
        Integer[] integers = integerStream.toArray(Integer[]::new);
        System.out.println(Arrays.toString(integers));

    }
}
