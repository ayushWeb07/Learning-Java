package section15;

public class EqualsDemo {
    public static void main(String[] args) {
        Person p1= new Person("Ayush", 19, "_xayush_fr");
        Person p2= p1;

        System.out.println(p1.equals(p2)); // true

        // change the p2 object and hence it points to some other memory location
        p2= new Person("Aditi", 18, "mini_dooky");
        System.out.println(p1.equals(p2)); // false

        // create a new object with the same values as p2, but still it points to some other memory location
        Person p3= new Person("Aditi", 18, "mini_dooky");
        System.out.println(p2.equals(p3));
    }
}
