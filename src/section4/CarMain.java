package section4;

public class CarMain {
    public static void main(String[] args) {
        Car c= new Car();

        System.out.println(c.color);
        System.out.println(c.brand);
        System.out.println(c.price);
        System.out.println(c.hp);

        System.out.println(Car.CAR_TYPE);
        System.out.println(Car.NUM_CYLINDERS);
    }
}
