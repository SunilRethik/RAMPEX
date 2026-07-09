package Day_10;

public class OOP {
    public static void main(String[] args) {

        CAR c1 = new CAR();

        c1.drive();

        System.out.println(c1);
    }
}

class CAR {

    String brand = "BMW";
    String model = "M5";

    public void drive() {
        System.out.println("Driving...");
    }

    @Override
    public String toString() {
        return "Brand: " + brand + ", Model: " + model;
    }
}