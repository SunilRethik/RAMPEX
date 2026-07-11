package Day_8.Homework_task;

public class Expression3 {
    public static void main(String[] args) {
        int a = 2;
        int b = 5;
        int c = 3;
        System.out.println(a++ + ++b * c-- - --a + b++);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
