package section17;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayIteration {
    public static void main(String[] args) {
        ArrayList<String> dreams= new ArrayList<>();
        dreams.add("SS1000R");
        dreams.add("iPhone 18");
        dreams.add("GT3RS");
        dreams.add("Gulf F17");

        // iterate using for each loop
        for (String d: dreams) {
            System.out.println(d);
        }

        System.out.println();

        // iterate using iterator
        Iterator<String> it= dreams.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println();

        // iterate using list iterator
        ListIterator<String> lit= dreams.listIterator();

        while (lit.hasNext()) {
            System.out.println(lit.next());
        }

        System.out.println();

        // backward iteration
        while (lit.hasPrevious()) {
            System.out.println(lit.previous());
        }
    }
}
