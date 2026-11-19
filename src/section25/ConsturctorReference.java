package section25;

public class ConsturctorReference {
    public static void main(String[] args) {
        // approach 1
        CarInterface c1= (String brand, String model) -> new Car(brand, model);

        // approach 2
        CarInterface c2= Car::new;

        // create the cars
        Car car1= c1.createNewCar("BMW", "M5");
        Car car2= c2.createNewCar("Ferrari", "SF9");

        System.out.println(car1);
        System.out.println(car2);
    }
}
