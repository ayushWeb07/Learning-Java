package section6;

public class StringsDemo {
    public static void main(String[] args) {
        String a= "hi";
        String b= "hi";
        String c= "hey";

        System.out.println(a == b); // references to the same memory location
        System.out.println(b == c);
        System.out.println(c == a);

        // learning about string interning
        String h= new String("hi");
        String h2= h.intern();
        System.out.println(a == h);
        System.out.println(a == h2);
    }
}
