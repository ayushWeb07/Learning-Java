package section21;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class LinkedHashsetDemo {
    public static void main(String[] args) {
        LinkedHashSet<Integer> s= new LinkedHashSet<>();

        // add the elements
        s.add(3);
        s.add(2);
        s.add(5);
        s.add(1);
        s.add(4);

        System.out.println(s);
    }
}
