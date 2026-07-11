package Day_9.Class_task;

class methods {
    public static void main(String[] args) {
        greet("Shree", 20);
        System.out.println(adder(2,3,4,5,6,7,8,9));
        System.out.println(pi());
        multiply(2,4);
    }

    public static void greet(String name, int age) {
        System.out.println("Good Evening " + name + ", Your age is " + age);
    }

    public static int adder(int... num){
        int sum = 0;
        for(int i = 0; i < num.length; i++){   // ✅ fixed here
            sum = sum + num[i];
        }
        return sum;
    }

    public static double pi(){
        return 3.14;
    }

    public static void multiply(int a, int b){
        System.out.print(a*b);
    }
}