package section26;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.Stream;

public class StreamCreation {
    public static void main(String[] args) {
        // approach 1: from lists
        ArrayList<String> list= new ArrayList<>();
        list.add("virat");
        list.add("ronaldo");
        list.add("jordan");
        list.add("lewis");
        list.add("rogan");

        Stream<String> stream1= list.stream();
        stream1.forEach(System.out::println);
        System.out.println();

        // approach 2: stream.of
        Stream<String> stream2  = Stream.of("virat", "ronaldo", "jordan", "lewis", "rogan");
        stream2.forEach(System.out::println);
        System.out.println();

        // approach 3: parallel stream
        Stream<String> stream3= list.parallelStream();
        stream3.forEach(System.out::println);
        System.out.println();

        // approach 4: create stream from array
        String[] arr= {"virat", "ronaldo", "jordan", "lewis", "rogan"};
        Stream<String> stream4= Arrays.stream(arr);
        stream4.forEach(System.out::println);
        System.out.println();

        // approach 5: generate infinite stream of random numbers
        // Stream.generate(new Random()::nextInt).forEach(System.out::println);

        // approach 6: generate infinute stream using iterate
        // Stream.iterate(0.1, (Double n) -> n + 0.1).forEach(System.out::println);
    }
}
