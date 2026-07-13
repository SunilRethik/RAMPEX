package Day_20;

import java.util.stream.Stream;

public class LongestNameInStream {
    public static void main(String[] args) {

        Stream<String> s = Stream.of("sunilrethik", "satheesh", "vetriselvan", "raja");

        System.out.println(
                s.map(n -> n.length()).reduce(0, (a, b) -> a > b ? a : b));
    }
}