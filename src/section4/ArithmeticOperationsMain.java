package section4;

public class ArithmeticOperationsMain {
    public static void main(String[] args) {
        ArithmeticOperations ao= new ArithmeticOperations(6, 9);

        System.out.println(ao.add());
        System.out.println(ArithmeticOperations.sum(6, 9));

        System.out.println(ao.pi);
        System.out.println(ArithmeticOperations.PI);
    }
}
