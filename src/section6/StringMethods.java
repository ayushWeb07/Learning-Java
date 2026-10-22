package section6;

public class StringMethods {
    public static void main(String[] args) {
        String a= "Im";
        String b= "The";
        String c= "Fucking best";
        String d= "That you never had";
        String e= "";

        String full= a + " " + b + " " + c + " " + d;
        int len= full.length();

        System.out.println(full);
        System.out.println(len);

        // access the characters
        System.out.println(full.charAt(10));
        System.out.println(full.charAt(11));
        System.out.println(full.charAt(12));

        // check if empty
        System.out.println("".equals(a));
        System.out.println("".equals(e));

        // upper and lowercase
        System.out.println(full.toUpperCase());
        System.out.println(full.toLowerCase());
    }
}
