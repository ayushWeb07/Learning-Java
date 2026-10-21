package section4;

public class Car {
    String color;
    String brand;
    double price;
    int hp;

    {
        this.color= "black";
        this.brand= "bmw m5";
    }

    {
        this.price= 80000.00;
    }

    {
        this.hp= 1300;
    }

    void accelerate() {
        System.out.println("Car accelerating...");
    }

    void applyBrakes() {
        System.out.println("Car applying brakes...");
    }

    void changeGear() {
        System.out.println("Car changing gears...");
    }
}
