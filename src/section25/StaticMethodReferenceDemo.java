package section25;

public class StaticMethodReferenceDemo {
    public static void main(String[] args) {
        // approach 1 -> write the lambda
        IOperation sum= (int a, int b) -> System.out.println(a + b);

        // approach 2 -> use the static method reference
        IOperation sum2= StaticMethodReferenceDemo::perform;

        sum.perform(3, 5);
        sum2.perform(11, 3);
    }

    static void perform(int a, int b) {
        System.out.println(a + b);
    }
}
