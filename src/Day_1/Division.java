package Day_1 ;

class Division {
    public static void main(String[] args) {
        int a = 7;
        int b = 2;

        int intResult = a / b;
        double floatResult = (double) a / b;

        System.out.println("Integer Division: " + a + " / " + b + " = " + intResult);
        System.out.println("Float Division: " + a + " / " + b + " = " + floatResult);
    }
}