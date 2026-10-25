package section10;

public class Maths {
    private int a;
    private int b;

    Maths(int a, int b) {
        this.a= a;
        this.b= b;
    }

    public void show(String a, String b) {
        System.out.printf("%s %s%n", a, b);
    }

    public void show(String a, String b, String c) {
        System.out.printf("%s %s %s%n", a, b, c);
    }

    public void show(int a, String b) {
        System.out.printf("%d %s%n", a, b);
    }

    public void show(String a, int b) {
        System.out.printf("%s %d%n", a, b);
    }
}
