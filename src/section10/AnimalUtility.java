package section10;

public class AnimalUtility {
    public static void performAction(Animal am) {
        am.eat();

        if (am instanceof Dog dg) {
            dg.bark();
        }

        else if (am instanceof Cat ct) {
            ct.meow();
        }
    }
}
