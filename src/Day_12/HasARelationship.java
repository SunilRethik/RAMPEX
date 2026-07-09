package Day_12;

public class HasARelationship {
    public static void main(String[] args) {

        Engine e = new Engine();
        Car c = new Car();

        c.engine = e;

        c.drive();
    }
}

class Engine {

    void start() {
        System.out.println("Engine started");
    }
}

class Car {

    Engine engine;  // Car HAS-A Engine

    void drive() {

        engine.start();

        System.out.println("Car is driving");
    }
}