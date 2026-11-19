package section24;

public class LambdaDemo {
    public static void main(String[] args) {
        // approach 1
        IHello iHello1= (String name) -> System.out.printf("Hello %s%n", name);
        sayHello(iHello1);

        // approach 2
        sayHello((String name) -> System.out.printf("Namaste %s%n", name));

        // some more lambda expressions
        IOperation plus= (a, b) -> a + b;
        IOperation minus= (a, b) -> a - b;
        IOperation multiply= (a, b) -> a * b;
        IOperation divide= (a, b) -> a / b;

        System.out.println(plus.performOperation(31, 65));
        System.out.println(minus.performOperation(65, 31));
        System.out.println(multiply.performOperation(5, 123));
        System.out.println(divide.performOperation(310, 65));
    }

    public static void sayHello(IHello iHello) {
        iHello.sayHello("Ayush");
    }
}
