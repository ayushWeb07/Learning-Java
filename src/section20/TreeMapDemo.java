package section20;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        Map<Integer, String> shirts= new TreeMap<>();

        shirts.put(7, "Ronaldo");
        shirts.put(18, "Virat");
        shirts.put(23, "Jordan");
        shirts.put(44, "Lewis");
        shirts.put(5, "Dummy");

        for (Map.Entry<Integer, String> s: shirts.entrySet()) {
            System.out.println(s.getKey() + " -> " + s.getValue());
        }

    }
}
