package section14;

import java.util.Scanner;

public class ArrayHandling {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int[] arr= {1, 2, 3, 4, 5};

        for (int i= 0; i<5; i++) {
            System.out.printf("%d ", arr[i]);
        }

        System.out.println();

        try {
            System.out.println(arr[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: you're trying to access an index that's out of range");
        }
    }
}
