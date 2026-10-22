package section5;

/**
 * This is an example of javadoc
 * @since 1.0.0
 * @author Ayush
 * @see section4.CarMain
 */

public class JavaDocExamples {
    public static void main(String[] args) {
        System.out.println("Hey world");
    }

    /**
     * @param n1 int representing first number
     * @param n2 int representing second number
     * @return sum of n1 & n2
     */
    public static int add(int n1, int n2) {
        return n1 + n2;
    }
}
