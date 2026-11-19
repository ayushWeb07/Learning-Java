package section25;

import java.util.ArrayList;

public class ClassMethodsReference {
    public static void main(String[] args) {
        ArrayList<String> list= new ArrayList<>();
        list.add("hi");
        list.add("hi");
        list.add("hi");
        list.add("hi");

        // approach 1
        list.forEach((String st) -> System.out.println(st));

        System.out.println();

        // approach 2
        list.forEach(System.out::println);
    }
}
