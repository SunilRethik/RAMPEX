package Day_7.Class_Task;

public class Maxarray {
    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 5, 3};

        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Maximum = " + max);

    }
}