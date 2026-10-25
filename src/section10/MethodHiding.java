package section10;

class Parent {
    static void show() {
        System.out.println("Parent is showing");
    }
}

class Child extends Parent {
    static void show() {
        System.out.println("Child is showing");
    }
}

public class MethodHiding {
    public static void main(String[] args) {
        Parent.show();
        Child.show(); // child's static show() sort of overrides the parent's static show()
    }
}
