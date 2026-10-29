package section16;

public class Caching {
    public static void main(String[] args) {
        Integer a= Integer.valueOf(5);
        Integer b= Integer.valueOf(5);
        Integer c= Integer.valueOf(6);
        Integer d= Integer.valueOf(6);
        Integer e= Integer.valueOf(128);
        Integer f= Integer.valueOf(128);
        Integer g= 3;
        Integer h= 3;

        System.out.println(a == b); // t
        System.out.println(b == c); // f
        System.out.println(c == d); // t
        System.out.println(d == e); // f
        System.out.println(e == f); // f
        System.out.println(g == h); // t
    }
}
