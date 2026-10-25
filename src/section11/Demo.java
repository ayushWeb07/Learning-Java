package section11;

import jdk.dynalink.beans.BeansLinker;

public class Demo {
    public static void main(String[] args) {
        // create object of type car
        Car c= new Car();
        System.out.println(c.whatsMyType());
        c.start();
        c.stop();
        System.out.println(c.myGrassRoot());

        System.out.println();

        // create object of reference type Vehicle interface, but stores instance of bike class
        Vehicle b= new Bike();
        System.out.println(b.whatsMyType());
        b.start();
        b.stop();
        System.out.println(b.myGrassRoot());

        System.out.println();

        // call the static method of interface
        System.out.println(Vehicle.sayHello());
        System.out.println(Bike.sayHello());
    }
}
