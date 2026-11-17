package section20;

import java.util.Map;

public class ImmutableMapDemo {
    public static void main(String[] args) {
        Map<Integer, String> shirts= Map.ofEntries(
                Map.entry(7, "Ronaldo"),
                Map.entry(18, "Virat"),
                Map.entry(23, "Jordan"),
                Map.entry(44, "Lewis"),
                Map.entry(5, "Dummy")
        );

        for (Map.Entry<Integer, String> s: shirts.entrySet()) {
            System.out.println(s.getKey() + " -> " + s.getValue());
        }

        // shirts.put(19, "pata nahi"); -> throws UnsupportedOperationException
    }
}
