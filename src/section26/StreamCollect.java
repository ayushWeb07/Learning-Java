package section26;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCollect {
    public static void main(String[] args) {
        // 1: collect all the even numbers and add 3 to them -> then add them to a list

        List<Integer> nums= List.of(1, 2, 3, 4, 5, 6, 7, 8);
        List<Integer> filtererdNums= nums.stream()
                .filter((Integer n) -> n % 2 == 0)
                .map((Integer n) -> n + 3)
                .collect(Collectors.toList());

        filtererdNums.forEach(System.out::println);
        System.out.println();

        // 2: collect the length of words to a list
        ArrayList<String> words= new ArrayList<>();
        words.add("virat");
        words.add("ronaldo");
        words.add("jordan");
        words.add("lewis");
        words.add("rogan");

        List<Integer> lengths= words.stream()
                .map(String::length)
                .collect(Collectors.toList());

        lengths.forEach(System.out::println);
    }
}
