package section19;

public class GenericUtility {
    public static <T> void printSingle(T element) {
        System.out.println(element);
    }

    public static <T> void printArray(T[] arr) {
        for (T ele: arr) {
            System.out.println(ele);
        }
    }
}

