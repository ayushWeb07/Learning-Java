package section20;

import java.util.HashMap;
import java.util.Map;

public class HashmapDemo {
    public static void main(String[] args) {
        // initialization
        Map<Character, String> m= new HashMap<>();
        var shirts= new HashMap<Integer, String>();

        // insert the elements
        shirts.put(7, "Ronaldo");
        shirts.put(18, "Virat");
        shirts.put(23, "Jordan");
        shirts.put(44, "Lewis");
        shirts.put(5, "Dummy");

        System.out.printf("Size: %d%n", shirts.size());

        System.out.println();

        // getting the elements
        System.out.println(shirts.get(18));
        System.out.println(shirts.get(1)); // returns null
        System.out.println(shirts.get(23));

        System.out.println();

        // check if key or value exists
        System.out.println(shirts.containsKey(1));
        System.out.println(shirts.containsValue("Jordan"));

        // remove
        shirts.remove(5);

        System.out.println();

        System.out.printf("Size: %d%n", shirts.size());

        System.out.println();



    }
}
