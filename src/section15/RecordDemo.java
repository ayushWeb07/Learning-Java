package section15;

public class RecordDemo {
    public static void main(String[] args) {
        Fighter f= new Fighter("Islam", 28, 1);
        Fighter c= new Fighter("Islam", 28, 1);
        System.out.println(f);
        System.out.println(f.name());
        System.out.println(f.wins());
        System.out.println(f.losses());
        System.out.println(f == c); // false as points to different memory locations
        System.out.println(f.equals(c)); // true as contains the same value
    }
}
