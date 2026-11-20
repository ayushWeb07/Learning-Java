package section26;

import java.util.stream.Stream;

public class StreamLimitDemo {
    public static void main(String[] args) {
        Stream.iterate(0.1, (Double n) -> n + 0.1)
                .limit(20)
                .forEach(System.out::println);
    }
}
