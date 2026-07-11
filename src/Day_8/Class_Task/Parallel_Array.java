package Day_8.Class_Task;
 import java.util.Scanner;

class Parallel_Array {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         String [] drinks = {"pepsi","sprite","maza","mountain dew","cola","campa"};
         int [] prices = {35,30,37,40,25,20};





         System.out.println("pepsi,sprite,maza,mountain dew,cola,campa");

         System.out.println("which drink do you want: ");
         String name = sc.nextLine();

         System.out.println("Enter the Quantity: ");
         int qty = sc.nextInt();
         for (int i=0;i<drinks.length;i++){
            if(name==drinks[i]){

            }
         }

         System.out.println("The total amt is : ");
         System.out.println(1*prices[0]);


    }
}
