package section26;

import java.util.stream.Stream;

public class StreamSkipAndLimitDemo {
    public static void main(String[] args) {
        Stream.iterate(0.1, (Double n) -> n + 0.1)
                .skip(10) // skip first 10
                .limit(20) // limit till the next 20
                .forEach(System.out::println);
    }
}
