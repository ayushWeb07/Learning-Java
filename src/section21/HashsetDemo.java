package section21;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashsetDemo {
    public static void main(String[] args) {
        Set<String> s= new HashSet<>();
        s.add("Virat");
        s.add("Jordan");
        s.add("Lewis");
        s.add("Kobe");
        s.add("Lewis");
        s.add("Dummy");

        System.out.println(s);

        System.out.println(s.size());

        System.out.println(s.contains("Lewis"));

        s.remove("Dummy");

        System.out.println(s);

        // iteration method 1
        for (String st: s) {
            System.out.printf("%s ", st);
        }

        System.out.println();

        // iteration method 2
        Iterator<String> it= s.iterator();

        while (it.hasNext()) {
            System.out.printf("%s ", it.next());
        }
    }
}
