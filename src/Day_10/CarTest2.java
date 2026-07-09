package Day_10;

import java.util.Scanner;

class CarTest2 {
    public static void main(String[] args) {

            Cars c1 = new Cars();
            Cars c2 = new Cars();
            c1.setter();
            c2.setter();
            System.out.print(c1.brand);
        }
    }

    class Cars {
        String brand;
        String model;
        int maxspeed;
        int speed;

        Cars() {
            System.out.print("Constructed called");
        }

        public void setter() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the brand name: ");
            brand = sc.nextLine();
            System.out.print("Enter the model name: ");
            model = sc.nextLine();
            speed = 0;
            System.out.print("Enter the maxspeed name: ");
            maxspeed = sc.nextInt();
            sc.close();
        }

    }
