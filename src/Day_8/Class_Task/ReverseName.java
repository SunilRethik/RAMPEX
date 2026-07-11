package Day_8.Class_Task;
import java.util.Scanner;

     class ReverseName {
         public static void main(String[] args) {

             Scanner sc = new Scanner(System.in);

             System.out.print("Enter your name: ");
             String name = sc.nextLine();

             int n = name.length();

             System.out.print("Reverse Name: ");

             for (int i = n - 1; i >= 0; i--) {
                 System.out.println(name.charAt(i));
             }

             sc.close();
         }
     }

