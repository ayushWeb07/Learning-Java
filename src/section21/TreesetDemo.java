package section21;

import java.util.Set;
import java.util.TreeSet;

public class TreesetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> s= new TreeSet<>();

        // add the elements
        s.add(3);
        s.add(2);
        s.add(5);
        s.add(1);
        s.add(4);

        // get the size
        System.out.println(s.size());

        System.out.println(s);

        // check the first and last elements
        System.out.printf("%d %d%n", s.first(), s.last());

        // check if it contains
        System.out.println(s.contains(6));

        // remove
        s.remove(3);

        System.out.println(s);
    }
}
