package Day_12.Class_task;

public class IsARelationship {

    public static void main(String[] args) {

        // IS-A Relationship
        Vehicle v1 = new Vehicle();
        v1.drive();

        CAr c1 = new CAr();

        c1.brand = "BMW";
        c1.model = "M5";

        // HAS-A Relationship
        c1.engine = new Engines();

        c1.start();
        c1.drive();

        // Upcasting + Runtime Polymorphism
        Vehicle v2 = new CAr();
        v2.drive();
    }
}


// Parent Class
class Vehicle {

    public void start() {
        System.out.println("Vehicle Started...");
    }

    public void drive() {
        System.out.println("Vehicle driving...");
    }
}


// Child Class
class CAr extends Vehicle {

    String brand;
    String model;

    // HAS-A Relationship
    Engines engine;

    @Override
    public void drive() {
        System.out.println(brand + " " + model + " is driving...");
    }

    @Override
    public void start() {
        engine.start();
    }
}


// Engine Class
class Engines {

    public void start() {
        System.out.println("Engine Started...");
    }
}