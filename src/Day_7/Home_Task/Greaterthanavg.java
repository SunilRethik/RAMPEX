package Day_7.Home_Task;

public class Greaterthanavg {
    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 20, 25};

        int sum = 0;
        for (int num : arr) {
            sum += num;
        }

        double average = (double) sum / arr.length;

        int count = 0;
        for (int num : arr) {
            if (num > average) {
                count++;
            }
        }

        System.out.println("Average: " + average);
        System.out.println("Number of elements greater than average: " + count);
    }
}
