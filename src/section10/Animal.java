package section10;

public class Animal {
    private String name;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name= name;
    }

    public void eat() {
        System.out.printf("%nAnimal %s is eating...%n", this.name);
    }
}
