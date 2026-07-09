package Day_13;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number: ");

        int a = 0;

        // Input Exception Handling
        try {

            a = sc.nextInt();

            System.out.println("Got the Input");

        }
        catch (InputMismatchException e) {

            System.out.println("Please enter numbers only");

            e.printStackTrace();
        }


        // Manually Throwing Exception
        try {

            if (a > 10) {

                throw new ArithmeticException();
            }

        }
        catch (ArithmeticException e) {

            System.out.println("Number should not be greater than 10");

            e.printStackTrace();
        }


        System.out.println("Value of a: " + a);

        System.out.println("Program Ended Successfully");
    }
}