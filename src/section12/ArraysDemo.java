package section12;

import java.util.Arrays;

public class ArraysDemo {

    static void show(int[] arr) {
        for (int n: arr) {
            System.out.printf("%d ", n);
        }
    }

    public static void main(String[] args) {
        // 1. simple declaration
        int[] arr= {1, 2, 3, 4};

        int[] arr2= new int[4];
        arr2[0]= 5;
        arr2[1]= 6;
        arr2[2]= 7;
        arr2[3]= 8;

        // 2. iteration

        // with for index
        for (int i= 0; i< arr.length; i++) {
            System.out.printf("%d ", arr[i]);
        }

        System.out.println();

        // with for each
        for (int n: arr2) {
            System.out.printf("%d ", n);
        }

        // 3. copying

        // using for loops
        int[] o1= {1, 2, 3};
        int[] n1= new int[o1.length + 2];

        for (int i=0; i<o1.length; i++) {
            n1[i]= o1[i];
        }

        System.out.println();
        ArraysDemo.show(n1);

        // using system
        int[] o2= {4, 5, 6};
        int[] n2= new int[o2.length + 2];
        System.arraycopy(o2, 0, n2, 0, o2.length);

        System.out.println();
        ArraysDemo.show(n2);

        // using array
        int[] o3= {7, 8, 9};
        int[] n3= Arrays.copyOf(o3, o3.length + 2);
        System.out.println();
        ArraysDemo.show(n3);
    }
}
