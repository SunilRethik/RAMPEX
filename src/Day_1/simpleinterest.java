package rampexday1;

class SimpleInterest {
    public static void main(String[] args) {
        double principal = 10000;
        double rate = 5;
        double time = 5;

        double simpleInterest = (principal * rate * time) / 100;
        double amount = principal + simpleInterest;

        System.out.println("Principal Amount: " + principal);
        System.out.println("Time Duration: " + time);
        System.out.println("Simple Interest: " + simpleInterest);
        System.out.println("Total Amount: " + amount);
    }
}
