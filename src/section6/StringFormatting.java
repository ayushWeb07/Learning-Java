package section6;

public class StringFormatting {
    public static void main(String[] args) {
        String m= "Hey, I'm %s, age: %d, net worth: $%.2f, has high testosterone: %b";
        System.out.println(String.format(m, "Ayush", 19, 15000.199, true));
        System.out.println(String.format(m, "Virat", 38, 14000.199, true));

        System.out.printf(m + "%n", "Bot", 19, 10.00, false);
    }
}
