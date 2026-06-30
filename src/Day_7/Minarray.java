package Day_7;

public class Minarray {
    public static void main(String[] args) {
        int[] arr = {-2,-7,1, 2, 4, 5, 3};

        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Minimum value = " + min);
    }
}
