package section26;

import java.util.ArrayList;

public class StreamFilterDemo {
    public static boolean checkIfWordPalindrome(String w) {
        int s= 0, e= w.length() - 1;

        while (s < e) {
            if (w.charAt(s) != w.charAt(e)) {
                return false;
            }

            s++;
            e--;
        }

        return true;
    }

    public static void main(String[] args) {
        // breaking down the steps
        ArrayList<String> list= new ArrayList<>();
        list.add("virat");
        list.add("ronaldo");
        list.add("jordan");
        list.add("lewis");
        list.add("rogan");

        list.stream()
                .filter((String s) -> s.startsWith("r"))
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

        // filter even numebers -> print them
        nums.stream()
                .filter((Integer n) -> n % 2 == 0)
                .forEach(System.out::println);

        System.out.println();

        // get only the palindrome words -> print them
        ArrayList<String> words= new ArrayList<>();
        words.add("malayalam");
        words.add("ronaldo");
        words.add("liril");
        words.add("lewis");
        words.add("aloola");

        words.stream()
                .filter(StreamFilterDemo::checkIfWordPalindrome)
                .forEach(System.out::println);
    }
}
