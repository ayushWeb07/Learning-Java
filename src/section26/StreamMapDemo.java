package section26;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamMapDemo {
    public static void main(String[] args) {
        // breaking down the steps
        ArrayList<String> list= new ArrayList<>();
        list.add("virat");
        list.add("ronaldo");
        list.add("jordan");
        list.add("lewis");
        list.add("rogan");

        // Stream<String> stream= list.stream(); // 1: get the input stream from the array
        // Stream<String> intermediateStream= stream.map(String::toUpperCase); // 2: apply the intermediate operation
        // intermediateStream.forEach(System.out::println); // 3: apply the terminal operation

        // wiring them together as a pipeline
        list.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);

        System.out.println();

        // another array list
        ArrayList<Integer> nums= new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        nums.add(6);

        // square them -> add 3 to them -> print them
        nums.stream()
                .map((Integer n) -> n * n)
                .map((Integer n) -> n + 3)
                .forEach(System.out::println);
    }
}
