package Day_8;

import java.util.Arrays;

public class Arrayreversal_2pointer {
    static void main(String[] args) {

        int [] nums=  {1,2,3,4,5,6,7,8,9,10};
        int n=nums.length;

        int left = 0;
        int right = n-1;
        int temp;

        for (int i=1; i <=n/2;i++) {
            temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;


            left++;
            right--;
        }
       System.out.println(Arrays.toString(nums));
    }
}
