package Day_5;

import java.util.Scanner;

public class even_product {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n=sc.nextInt();
        int product=1;
        for(int i=1;i<=n;i++){
            if(i%2==0){
                product*=i;
            }
        }
        System.out.println(product);
        sc.close();
    }
}
