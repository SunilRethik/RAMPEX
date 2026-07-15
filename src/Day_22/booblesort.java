package Day_22;

import java.util.Arrays;

class BubbleSort {

    public static int[] bubbleSort(int[] arr) {

        int n = arr.length;
        int temp;

        // Outer loop
        for (int i = 0; i < n - 1; i++) {

            // Inner loop
            for (int j = 0; j < n - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {

                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }
        }

        return arr;
    }

    public static void main(String[] args) {

        int[] arr = {5, 3, 8, 4, 2};

        System.out.println(Arrays.toString(bubbleSort(arr)));
    }
}
