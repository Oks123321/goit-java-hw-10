package task5;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMixTests {
    public static void main(String[] args) {
        Stream<String> stream1 = Stream.of("Ann", "Boris", "Barbara", "Peter", "John", "Mary", "Alex", "Max",
                "Andrew", "George", "Lily", "Samanta", "Sam");
        Stream<String> stream2 = Stream.of("1", "2", "3", "4", "5");

        System.out.println("StreamMixer.zip(stream1, stream2) = " + StreamMix.zip(stream1, stream2).collect(Collectors.toList()));
    }
}
