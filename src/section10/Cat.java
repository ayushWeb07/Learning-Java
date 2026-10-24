package section10;

public class Cat extends Animal {
    public void eat() {
        System.out.printf("%nCat %s is eating...%n", this.getName());
    }

    public void meow() {
        System.out.printf("%nCat %s is meowing...%n", this.getName());
    }
}
