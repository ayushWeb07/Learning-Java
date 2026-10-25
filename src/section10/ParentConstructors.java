package section10;

class Papa {
    public String a;

    Papa(String a) {
        this.a= a;
    }
}

class Beta extends Papa {
    public String b;

    Beta(String a, String b) {
        super(a);
        this.b= b;
    }
}

class GrandBeta extends Beta {
    public String c;

    GrandBeta(String a, String b, String c) {
        super(a, b);
        this.c= c;
    }
}

public class ParentConstructors {
    public static void main(String[] args) {
        Papa p= new Papa("baap hu");
        System.out.println(p.a);

        Beta b= new Beta("im his baap", "im his puttar");
        System.out.printf("%s | %s%n", b.a, b.b);

        GrandBeta g= new GrandBeta("baap haha", "puttar haha", "grand puttar haha");
        System.out.printf("%s | %s | %s%n", g.a, g.b, g.c);
    }
}
