package section21;

import java.util.HashSet;
import java.util.Set;

public class HashsetOperations {
    public static void main(String[] args) {
        Set<Integer> s1= new HashSet<>();
        Set<Integer> s2= new HashSet<>();

        // add the elements
        s1.add(1);
        s1.add(8);
        s1.add(3);

        s2.add(8);
        s2.add(9);
        s2.add(5);

        // print
        System.out.println(s1);
        System.out.println(s2);

        // union the elements
        // s1.addAll(s2);
        // System.out.println(s1);

        // intersection the elements
        // s1.retainAll(s2);
        // System.out.println(s1);

        // difference of the elements
        // s1.removeAll(s2);
        // System.out.println(s1);

        // check if s1 contains all the elements as of the s2
        System.out.println(s1.containsAll(s2));
    }
}
