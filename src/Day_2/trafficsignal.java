package rampexday2;


import java.util.Scanner;
class Trafficsignal{
    public static void main(String[]args){
        String colour = "green";
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        if(sc.equals(colour)){
            System.out.print("go");
        }else{
            System.out.print("stop");
        }
    }
}
