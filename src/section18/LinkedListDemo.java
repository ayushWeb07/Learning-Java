package section18;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListDemo {
    public static void main(String[] args) {
        // initialize the linked lists
        var names= new LinkedList<String>();
        List<Double> rates= new LinkedList<>();
        LinkedList<Integer> ll= new LinkedList<>();

        // add the elements
        ll.add(3);
        ll.add(1);
        ll.add(2);
        ll.add(5);
        ll.add(4);

        // print the info
        System.out.println(ll);

        System.out.println();

        System.out.println(ll.size());
        System.out.println(ll.getFirst());
        System.out.println(ll.getLast());

        System.out.println();

        // iterate using the for loop
        for (Integer n: ll) {
            System.out.println(n);
        }

        System.out.println();

        // iterate using list iterator
        ListIterator<Integer> it = ll.listIterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println();

        // backward iteration
        while (it.hasPrevious()) {
            System.out.println(it.previous());
        }
    }
}
