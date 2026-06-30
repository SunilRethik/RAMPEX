package Day_8.Homework_task;

import java.util.Scanner;

 class MissingNum {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int n = 6;
            int[] arr = new int[n - 1];

            System.out.println("Enter " + (n - 1) + " elements:");

            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            int asum = 0;
            int arsum = 0;

            for (int i = 1; i <= n; i++) {
                asum += i;
            }

            for (int i = 0; i < arr.length; i++) {
                arsum += arr[i];
            }

            int missing = asum - arsum;
            System.out.println("Missing Number = " + missing);
        }

    }


