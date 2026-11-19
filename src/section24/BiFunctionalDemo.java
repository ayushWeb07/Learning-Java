package section24;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BiFunctionalDemo {
    public static void main(String[] args) {
        // bi predicate -> get the sum and check if the sum is even or not
        BiPredicate<Integer, Integer> isSumEven= (Integer a, Integer b) -> (a + b) % 2 == 0;

        // bi function -> get the power
        BiFunction<Integer, Integer, Double> calculatePower= (Integer a, Integer b) -> Math.pow(a, b);

        // bi consumer -> concat the uppercased and lowercased
        BiConsumer<String, String> consumer= (String a, String b) -> System.out.printf("%s %s%n", a.toUpperCase(), b.toLowerCase());

        System.out.println(isSumEven.test(3, 5));
        System.out.println(isSumEven.test(4, 5));

        System.out.println();

        System.out.println(calculatePower.apply(2, 5));
        System.out.println(calculatePower.apply(3, 4));

        System.out.println();

        consumer.accept("Goat", "Virat");
        consumer.accept("Ronaldo", "Dominator");
    }
}
