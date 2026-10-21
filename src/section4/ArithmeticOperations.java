package section4;

public class ArithmeticOperations {
    int n1;
    int n2;
    double pi= 3.14;
    public static final double PI= 3.14;

    ArithmeticOperations(int n1, int n2) {
        this.n1= n1;
        this.n2= n2;
    }

    public int add() {
        return this.n1 + this.n2;
    }

    public static int sum(int n1, int n2) {
        return n1 + n2;
    }
}
