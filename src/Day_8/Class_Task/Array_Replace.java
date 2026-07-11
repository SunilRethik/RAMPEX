package Day_8.Class_Task;

import java.util.Arrays;

class Array_Replace {
   public static void main(String[] args) {

           int [] nums = {1,2,3,4};

           int temp = nums[0];
           nums[0] = nums[3];
           nums[3] = temp;

           System.out.println(Arrays.toString(nums));

           temp = nums[1];
           nums[1] = nums[2];
           nums[2] = temp;


           System.out.println(Arrays.toString(nums));
    }
}
