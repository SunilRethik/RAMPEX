package Day_7;

public class Productofarray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        int product = 1;

        for (int i = 0; i < arr.length; i++) {
            product *= arr[i];
        }

        System.out.println("Product of array elements: " + product);
    }
}
