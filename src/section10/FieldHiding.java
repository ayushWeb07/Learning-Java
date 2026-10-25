package section10;

class Avenger {
    public String name= "Avenger";
}

class IronMan extends Avenger {
    public String name= "Iron Man";
}

public class FieldHiding {
    public static void main(String[] args) {
        Avenger a= new Avenger();
        System.out.println(a.name);

        IronMan i= new IronMan();
        System.out.println(i.name);

        Avenger a2= new IronMan();
        System.out.println(a2.name);

        IronMan i2= (IronMan) a2;
        System.out.println(i2.name);
    }
}
