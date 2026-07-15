package rampexday1;

public class LargestNumber {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 15;

        if (a > b) {
            if (b > c) {
                System.out.println("a is largest");
            } else {
                System.out.println("c is the largest");
            }
        } else if (a < b) {
            if (b > c) {
                System.out.println("b is the largest");
            } else {
                System.out.println("c is the largest");
            }
        }
    }
}