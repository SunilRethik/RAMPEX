package Day_14.Home_Task;

interface Flyable {
    void fly();
}

class Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("Bird is flapping wings");
    }
}

class Airplane implements Flyable {
    @Override
    public void fly() {
        System.out.println("Airplane is engaging engines");
    }
}
public class FlyDemo {
    public static void main(String[] args) {
        Flyable[] objects = {new Bird(), new Airplane()};

        for (Flyable obj : objects) {
            obj.fly();
        }
    }
}
