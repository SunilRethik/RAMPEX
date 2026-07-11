package Day_11.Class_task;

public class Polymorphism {

    public static void main(String[] args) {

        greet();
        greet("Sunil");
        greet("Sunil", "Devil");
        greet(20);
    }

    // Method Overloading (Compile-time Polymorphism)

    public static void greet() {
        System.out.println("Good Afternoon");
    }

    public static void greet(String name) {
        System.out.println("Good Afternoon " + name);
    }

    public static void greet(String name, String name2) {
        System.out.println("Good Afternoon both of you " + name + " and " + name2);
    }

    public static void greet(int age) {
        System.out.println("Good Afternoon, your age is " + age);
    }
}