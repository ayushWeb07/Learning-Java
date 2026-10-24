package section10;

public class Downcasting {
    public static void main(String[] args) {
        Animal am;
        Dog dg;
        Cat ct;

        am= new Animal();
        am.setName("Red bull");

        dg= new Dog();
        dg.setName("Dooky husky");

        ct= new Cat();
        ct.setName("Dooky kitty");

        // dg.bark();
        // ct.meow();
        // dg.eat();
        // ct.eat();

        // before downcasting
        AnimalUtility.performAction(dg);
        AnimalUtility.performAction(ct);
    }
}
