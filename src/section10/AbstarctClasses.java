package section10;

abstract class Character {
    String name;

    Character(String name) {
        this.name= name;
    }

    void introduce() {
        System.out.printf("Hey, I'm %s%n", this.name);
    }

    abstract void whatsMyGenre();
}

class ShinChan extends Character {

    ShinChan() {
        super("ShinChan");
    }

    @Override
    void whatsMyGenre() {
        System.out.println("Hilarious comedy");
    }
}

class Doraemon extends Character {
    Doraemon() {
        super("Doraemon");
    }

    @Override
    void whatsMyGenre() {
        System.out.println("One-sided love");
    }
}

public class AbstarctClasses {
    public static void main(String[] args) {
        Character s= new ShinChan();
        s.introduce();
        s.whatsMyGenre();

        Character d= new Doraemon();
        d.introduce();
        d.whatsMyGenre();
    }
}
