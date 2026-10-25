package section10;

class A {
    public void show() {
        System.out.println("A is showing");
    }

    public void playing(String game) {
        System.out.printf("A is playing %s%n", game);
    }
}

class B extends A {
    @Override
    public void show() {
        System.out.println("B is showing");
    }

    @Override
    public void playing(String game) {
        super.playing(game);
        System.out.printf("B is playing %s%n", game);
    }
}

public class Binding {
    public static void main(String[] args) {
        // static binding -> a is of type A, and also refers to an instance of A
        A a= new A();
        a.show();
        a.playing("Insta");

        B b= new B();
        b.show();
        b.playing("Pubg");

        // dynamic binding  -> c is of type A, but refers to an instance of B
        A c= b;
        c.show(); // calls the B's show() as at runtime, jvm looks at the real object type i.e. B and calls its version
        c.playing("Free");
    }
}
