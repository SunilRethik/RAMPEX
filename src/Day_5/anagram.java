package Day_10.Home_task;

import java.util.Arrays;
import java.util.Scanner;

public class anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first name:");
        String name1 = sc.nextLine();
        System.out.println("Enter the second name:");
        String name2 = sc.nextLine();
        name1 = name1.toLowerCase();
        name2 = name2.toLowerCase();
        System.out.println(name1.length());
        System.out.println(name2.length());
        if(name1.length()!=name2.length()){
            System.out.println("Not Anagram");
            return;
        }
        char[] n1 = name1.toCharArray();
        char[] n2 = name2.toCharArray();
        Arrays.sort(n1);
        Arrays.sort(n2);
        if (Arrays.equals(n1,n2)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
