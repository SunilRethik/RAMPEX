package Day_8.Class_Task;

import java.util.Arrays;

class Movingzero {
     public  static void main(String[] args) {

             int[] nums = {2, 0, 3, 5, 0,0,6};

             int index = 0;

             for (int i = 0; i < nums.length; i++) {
                 if (nums[i] != 0) {
                     nums[index] = nums[i];
                     index++;
                 }
             }

             while (index < nums.length) {
                 nums[index] = 0;
                 index++;
             }

             System.out.println(Arrays.toString(nums));
         }
    }

