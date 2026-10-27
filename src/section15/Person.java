package section15;

public class Person {
    private String name;
    private int age;
    private String ig_id;

    Person() {
        this.name= "";
        this.age= 0;
        this.ig_id= "";
    }

    Person(String name, int age, String ig_id) {
        this.name= name;
        this.age= age;
        this.ig_id= ig_id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getIgId() {
        return this.ig_id;
    }

    public void setIgId(String ig_id) {
        this.ig_id = ig_id;
    }
}
