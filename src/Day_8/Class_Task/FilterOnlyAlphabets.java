package Day_8.Class_Task;

import java.util.Scanner;

public class FilterOnlyAlphabets {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your uer name: ");
        String username= sc.nextLine();

       for(int i=0;i<username.length();i++){
           if (username.charAt(i)>='a' && username.charAt(i)<='z'|| username.charAt(i)>='A' && username.charAt(i)<='Z' ){
               System.out.print(username.charAt(i));
           }
       }


    }

}
