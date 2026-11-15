package section19;

import java.util.ArrayList;

public class GenericUtilityMain {
    public static void main(String[] args) {
        // print single element
        GenericUtility.printSingle(10);
        GenericUtility.printSingle(1.5f);
        GenericUtility.printSingle("Virat");
        GenericUtility.printSingle(true);

        System.out.println();

        // print array
        Integer[] a1= {2, 1, 3, 5};
        GenericUtility.printArray(a1);

        System.out.println();

        String[] a2= {"Ronaldo", "Virat", "Goggins", "Phelps"};
        GenericUtility.printArray(a2);
    }
}
