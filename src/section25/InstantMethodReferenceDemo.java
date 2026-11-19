package section25;

public class InstantMethodReferenceDemo {
    public static void main(String[] args) {
        // approach 1 -> write the lambda
        IOperation sum= (int a, int b) -> System.out.println(a + b);

        // approach 2 -> use the instance method reference
        InstantMethodReferenceDemo objRef= new InstantMethodReferenceDemo();
        IOperation sum2= objRef::perform;

        sum.perform(3, 5);
        sum2.perform(11, 3);
    }

    void perform(int a, int b) {
        System.out.println(a + b);
    }
}
