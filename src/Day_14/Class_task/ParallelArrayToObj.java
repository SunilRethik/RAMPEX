package Day_14.Class_task;

import java.util.Scanner;

public class ParallelArrayToObj {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("WELCOME!!!");
        System.out.println();

        System.out.println("Enter 1 for Mazza");
        System.out.println("Enter 2 for Sprite");
        System.out.println("Enter 3 for Pepsi");
        System.out.println("Enter 4 for Campa");
        System.out.println("Enter 0 for Exit");

        int choice;
        float total = 0;

        Drink[] totalItems = new Drink[100];

        int pos = 0;

        do {

            System.out.print("\nEnter your choice: ");
            choice = sc.nextInt();

            if (choice == 0) {
                break;
            }

            System.out.print("Enter quantity: ");
            int qty = sc.nextInt();


            if (choice == 1) {

                Mazza m = new Mazza();

                total = total + (qty * m.price);

                System.out.println(
                        "Item: " + m.name +
                                ", Price: " + m.price
                );

                totalItems[pos++] = m;
            }


            else if (choice == 2) {

                Sprite s = new Sprite();

                total = total + (qty * s.price);

                System.out.println(
                        "Item: " + s.name +
                                ", Price: " + s.price
                );

                totalItems[pos++] = s;
            }


            else if (choice == 3) {

                Pepsi p = new Pepsi();

                total = total + (qty * p.price);

                System.out.println(
                        "Item: " + p.name +
                                ", Price: " + p.price
                );

                totalItems[pos++] = p;
            }


            else if (choice == 4) {

                Campa c = new Campa();

                total = total + (qty * c.price);

                System.out.println(
                        "Item: " + c.name +
                                ", Price: " + c.price
                );

                totalItems[pos++] = c;
            }


            else {

                System.out.println("Invalid Choice");
            }

        } while (choice != 0);


        System.out.println("\nPurchased Items:");

        for (int i = 0; i < pos; i++) {

            System.out.println(
                    totalItems[i].name +
                            " - Rs." +
                            totalItems[i].price
            );
        }


        System.out.println("\nTotal Price is Rs." + total);

        sc.close();
    }
}


class Drink {

    String name;
    float price;

    Drink(String name, float price) {

        this.name = name;
        this.price = price;
    }
}


class Mazza extends Drink {

    Mazza() {
        super("Mazza", 20f);
    }
}


class Sprite extends Drink {

    Sprite() {
        super("Sprite", 30f);
    }
}


class Pepsi extends Drink {

    Pepsi() {
        super("Pepsi", 25f);
    }
}


class Campa extends Drink {

    Campa() {
        super("Campa", 10f);
    }
}