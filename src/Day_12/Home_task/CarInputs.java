package Day_12.Home_task;

public class CarInputs {
    public static void main(String[] args) {
        Car car = new Car();
        car.drive();
//        SportsCar car = new SportsCar();
//        car.start();
//        Car car = new SportsCar();//Parent Reference
//        car.start();
//        SportsCar car = new SportsCar();//Method Overriding
//        car.start();
//        car.start();//Simple Inheritance
//        car.turbo();
    }
}
class Engine {
    void ignite() {
        System.out.println("Engine Started");
    }
}
class Car {
    Engine engine = new Engine();

    void drive() {
        engine.ignite();
        System.out.println("Car Moving");
    }
}
