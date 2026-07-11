package Day_8.Class_Task;

import java.util.Scanner;
import java.time.LocalDateTime;

public class ParallelArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] drinks = {"Pepsi", "Sprite", "Maza", "Mountain Dew", "Cola", "Campa"};
        int[] prices = {35, 30, 37, 40, 25, 20};

        String[] billDrink = new String[20];
        int[] billQty = new int[20];
        int[] billPrice = new int[20];
        int[] billAmount = new int[20];

        int count = 0;
        int subtotal = 0;
        char choice;

        System.out.println("======================================");
        System.out.println("          SUNIL CAFE");
        System.out.println("======================================");
        System.out.println("Order No : " + ((int)(Math.random() * 9000) + 1000));
        System.out.println("Date & Time : " + LocalDateTime.now());

        System.out.println("\n------ AVAILABLE DRINKS ------");
        for (int i = 0; i < drinks.length; i++) {
            System.out.println(drinks[i] + " - ₹" + prices[i]);
        }

        do {

            System.out.print("\nEnter Drink Name : ");
            String name = sc.nextLine();

            boolean found = false;

            for (int i = 0; i < drinks.length; i++) {

                // equalsIgnoreCase() ignores uppercase and lowercase
                if (name.equalsIgnoreCase(drinks[i])) {

                    System.out.print("Enter Quantity : ");
                    int qty = sc.nextInt();

                    int amount = prices[i] * qty;

                    billDrink[count] = drinks[i];
                    billQty[count] = qty;
                    billPrice[count] = prices[i];
                    billAmount[count] = amount;

                    subtotal += amount;
                    count++;

                    System.out.println("Added Successfully!");
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Drink Not Available");
            }

            sc.nextLine(); // clear buffer

            System.out.print("Do you want another drink? (Y/N): ");
            choice = sc.nextLine().charAt(0);

        } while (choice == 'Y' || choice == 'y');

        // Coupon
        double discount = 0;

        System.out.print("\nDo you have Coupon? (Y/N): ");
        char couponChoice = sc.nextLine().charAt(0);

        if (couponChoice == 'Y' || couponChoice == 'y') {

            System.out.print("Enter Coupon Code : ");
            String coupon = sc.nextLine();

            // equalsIgnoreCase() used here also
            if (coupon.equalsIgnoreCase("SUNIL15")) {
                discount = subtotal * 0.15;
                System.out.println("Coupon Applied Successfully!");
            } else {
                System.out.println("Invalid Coupon!");
            }
        }

        double afterDiscount = subtotal - discount;
        double gst = afterDiscount * 0.05;
        double finalBill = afterDiscount + gst;

        // Payment Method
        System.out.println("\nSelect Payment Method");
        System.out.println("1. Cash");
        System.out.println("2. UPI");
        System.out.println("3. Card");

        System.out.print("Enter Choice : ");
        int pay = sc.nextInt();

        String payment = "";

        switch (pay) {
            case 1:
                payment = "Cash";
                break;
            case 2:
                payment = "UPI";
                break;
            case 3:
                payment = "Card";
                break;
            default:
                payment = "Invalid";
        }

        // Final Bill
        System.out.println("\n==============================================");
        System.out.println("                 FINAL BILL");
        System.out.println("==============================================");

        System.out.printf("%-18s %-8s %-8s %-8s\n",
                "Drink", "Qty", "Price", "Amount");

        for (int i = 0; i < count; i++) {
            System.out.printf("%-18s %-8d %-8d %-8d\n",
                    billDrink[i],
                    billQty[i],
                    billPrice[i],
                    billAmount[i]);
        }

        System.out.println("----------------------------------------------");
        System.out.println("Subtotal          : ₹" + subtotal);
        System.out.printf("Discount (15%%)   : ₹%.2f\n", discount);
        System.out.printf("GST (5%%)         : ₹%.2f\n", gst);
        System.out.println("----------------------------------------------");
        System.out.printf("Final Bill        : ₹%.2f\n", finalBill);
        System.out.println("Payment Method    : " + payment);

        if (finalBill >= 500) {
            System.out.println("🎁 Free Gift : Pepsi");
        }

        System.out.println("==============================================");
        System.out.println("        THANK YOU! VISIT AGAIN 😊");
        System.out.println("==============================================");

        sc.close();
    }
}