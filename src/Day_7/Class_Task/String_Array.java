package Day_7.Class_Task;
import java.util.Arrays;

public class String_Array  {
   public static void main(String[] args) {
       int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
       int[] even = new int[5];

       int j = 0;
       for (int i = 0; i < arr.length; i++) {
           if (arr[i] % 2 == 0) {
               even[j++] = arr[i];
           }
       }

       System.out.println(Arrays.toString(even));

    }

    }