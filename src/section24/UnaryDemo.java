package section24;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class UnaryDemo {
    public static void main(String[] args) {
        // unary 1
        UnaryOperator<Integer> multiplyByFive = (Integer a) -> a * 5;

        System.out.println(multiplyByFive.apply(19));
    }

    public static List<Integer> incrementList(List<Integer> numbers, int incrementValue) {
        // Define a lambda expression using the UnaryOperator functional interface
        UnaryOperator<Integer> unaryOperator= (Integer n) -> n + incrementValue;

        // Apply the lambda expression to each integer in the list
        List<Integer> res= new ArrayList<>();

        for (int n: numbers) {
            res.add(unaryOperator.apply(n));
        }

        return res;
    }
}
