package section18;

import java.util.*;

public class LinkedListSorting {
    public static void main(String[] args) {
        // initialize the linked list
        LinkedList<Integer> ll= new LinkedList<>();

        // add the elements
        ll.add(3);
        ll.add(1);
        ll.add(2);
        ll.add(5);
        ll.add(4);

        // print the ll
        System.out.println(ll);

        // method 1
        Collections.sort(ll);
        System.out.println(ll);

        Collections.sort(ll, Collections.reverseOrder());
        System.out.println(ll);

        // method 2
        ll.sort(Comparator.naturalOrder());
        System.out.println(ll);
        ll.sort(Comparator.reverseOrder());
        System.out.println(ll);

    }
}
