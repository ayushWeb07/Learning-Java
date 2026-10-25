package section10;

class A {
    public void show() {
        System.out.println("A is showing");
    }
}

class B extends A {
    public void show() {
        System.out.println("B is showing");
    }
}

public class Binding {
    public static void main(String[] args) {
        // static binding -> a is of type A, and also refers to an instance of A
        A a= new A();
        a.show();

        B b= new B();
        b.show();

        // dynamic binding  -> c is of type A, but refers to an instance of B
        A c= b;
        c.show(); // calls the B's show() as at runtime, jvm looks at the real object type i.e. B and calls its version
    }
}
