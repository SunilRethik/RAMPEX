package Day_7;

public class SecondMax {

        public static void main(String[] args) {

            int[] arr = {1, 2, 4, 5, 5, 3};

            int max = arr[0];
            int sMax = arr[0];

            for (int i = 1; i < arr.length; i++) {

                if (arr[i] > max) {
                    sMax = max;
                    max = arr[i];
                }
                else if (arr[i] > sMax && arr[i] != max) {
                    sMax = arr[i];
                }
            }

            System.out.println("Maximum = " + max);
            System.out.println("Second Maximum = " + sMax);
        }
    }

