package section6;

public class StringEquals {
    public static void main(String[] args) {
        String a= "Hey world";
        String b= "Hey WoRld";

        System.out.println(a.equals(b));
        System.out.println(a.equalsIgnoreCase(b));
    }
}
