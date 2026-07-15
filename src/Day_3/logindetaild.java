package Day_3 ;


import java.util.Scanner;
class Logindetails{
    public static void main(String[]args){
        String originalUsername = "Sri";
        int originalpass =3241;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the username:");
        String username =sc.nextLine();
        System.out.print("Enter the pass:");
        int pass = sc.nextInt();
        if(originalUsername==username&&originalpass==pass){
            System.out.print("welcome!!");
        }else{
            System.out.print("Invalid credentials");
        }
    }
}