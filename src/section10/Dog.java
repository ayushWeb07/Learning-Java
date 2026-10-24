package section10;

public class Dog extends Animal {
    public void eat() {
        System.out.printf("%nDog %s is eating...%n", this.getName());
    }

    public void bark() {
        System.out.printf("%nDog %s is barking...%n", this.getName());
    }
}
