package section15;

public class ToStringDemo {
    public static void main(String[] args) {
        Person p1= new Person("Ayush", 19, "_xayush_fr");
        Person p2= new Person("Aditi", 18, "mini_dooky");

        System.out.println(p1.toString());
        System.out.println(p2.toString());
    }
}
