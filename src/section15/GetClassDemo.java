package section15;

public class GetClassDemo {
    public static void main(String[] args) {
        Person p= new Person();

        Class personClass= p.getClass();
        System.out.println(personClass.getName());
        System.out.println(personClass.getPackageName());
        System.out.println(personClass.getSimpleName());
    }
}
