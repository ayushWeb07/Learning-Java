package section24;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        // consumer 1
        Consumer<String> sayHello= (String name) -> System.out.printf("Hello there, Mr. %s!%n", name);

        // consumer 2
        Consumer<Integer> printNumber= (Integer num) -> System.out.printf("Number you entered: %d%n", num);

        sayHello.accept("Virat");
        printNumber.accept(18);
    }

    public static void convertAndPrint(List<String> inputString) {
        Consumer<String> consumer= (String st) -> System.out.println(st.toUpperCase());

        for (String s: inputString) {
            consumer.accept(s);
        }
    }
}
