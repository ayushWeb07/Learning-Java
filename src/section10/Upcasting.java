package section10;

public class Upcasting {
    public static void main(String[] args) {
        Animal am;
        am= new Dog();
        am.setName("Dooky Husky");
        am.eat();

        Animal am2;
        am2= new Animal();
        am2.setName("Red bull");
        am2.eat();
    }
}
