package section6;

public class MutableStrings {
    public static void main(String[] args) {
        StringBuilder b= new StringBuilder();
        b.append("I'm the");
        b.insert(7, " fucking best");
        System.out.println(b.toString());
        b.delete(1, 3);
        System.out.println(b.toString());
        b.reverse();
        System.out.println(b.toString());
        b.reverse();
        b.append("!!!!!!!");
        System.out.println(b.toString());

        // check if a string palindrome
        StringBuilder st= new StringBuilder("haha");
        String p= st.toString();
        String n= st.reverse().toString();
        System.out.printf("Is string palindrome: %b%n", p.equals(n));
    }
}
