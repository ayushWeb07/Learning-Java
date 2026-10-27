package section15;

public class CloneDemo {
    public static void main(String[] args) {
        Person p1= new Person("Ayush", 19, "_xayush_fr");
        Person p2= p1;

        System.out.println(p1.equals(p2)); // true
        System.out.println(p1 == p2);

        // change the p2 object and hence it points to some other memory location
        p2= new Person("Aditi", 18, "mini_dooky");
        System.out.println(p1.equals(p2)); // false
        System.out.println(p1 == p2);

        // create a new object with the same values as p2, but still it points to some other memory location
        Person p3= new Person("Aditi", 18, "mini_dooky");
        System.out.println(p2.equals(p3));
        System.out.println(p2 == p3);

        try {
            Person p4= (Person) p3.clone();
            System.out.println(p4.equals(p3));
            System.out.println(p4 == p3);
        } catch (CloneNotSupportedException e) {
            System.out.println("Error: something went wrong while cloning the person object");
        }
    }
}
