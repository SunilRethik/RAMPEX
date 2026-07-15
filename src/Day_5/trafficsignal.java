package Day_5;

import java.util.Scanner;

 class traffic_signal_using_class {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the colour:");
        switch (scanner.nextLine()) {
            case "red" -> System.out.println("Stop");
            case "yellow" -> System.out.println("Ready");
            case "green" -> System.out.println("Go");
            default -> System.out.println("invalid colour");
        }

        scanner.close();
    }
}
