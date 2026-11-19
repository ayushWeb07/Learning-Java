package section24;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        // function 1
        Function<String, Boolean> isUpperCase= (String s) -> s.equals(s.toUpperCase());

        // function 2
        Function<Integer, String> checkNumberType= (Integer num) -> (num % 2 == 0)? "even" : "odd";

        // function 3 and 4
        Function<Integer, Integer> multiplyByTwo= (Integer a) -> a * 2;
        Function<Integer, Integer> addByTen= (Integer a) -> a + 10;

        // and then:= first pred. -> second pred.
        Function<Integer, Integer> p1= multiplyByTwo.andThen(addByTen);

        // compose:= second pred. -> first pred.
        Function<Integer, Integer> p2= multiplyByTwo.compose(addByTen);

        System.out.println(isUpperCase.apply("hi"));
        System.out.println(isUpperCase.apply("Hey"));
        System.out.println(isUpperCase.apply("GOAT"));

        System.out.println();

        System.out.println(checkNumberType.apply(10));
        System.out.println(checkNumberType.apply(31));

        System.out.println();

        System.out.println(p1.apply(3));
        System.out.println(p2.apply(6));
    }

    public static List<Integer> transformStringLengths(List<String> strings) {
        List<Integer> res= new ArrayList<>();

        // Define a lambda expression using the Function functional interface
        Function<String, Integer> f= (String st) -> st.length();

        // Apply the lambda expression to each string in the list
        for (String st: strings) {
            res.add(f.apply(st));
        }

        return res;
    }
}
