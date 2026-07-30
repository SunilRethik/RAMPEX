package Day_28;

public class MaximumSumSubArray {


    public static void main(String[] args) {
        int arr []= {1,-1,0 ,2,1,2};

        System.out.println(  maximumSum(arr,2));

    }



    static  int maximumSum(int [] arr, int k){

        int sum =0;
        int max =0;



        // {1,-1,0 ,2,1,2}  k =2
        for (int i =0 ; i<k;i++){


            sum =sum +arr[i];

        }
// no need of nested to add all the other subArrays

        //2 sub     sum =sum+arr[2]- arr[0];

        //3 sub     sum =sum+arr[3]- arr[1];

        //4 sub     sum =sum+arr[4]- arr[2];

        for(int j =k; j<arr.length;j++){

            sum =sum +arr[j]-arr[j-2];
        }


        max = sum>max? sum: max;


        return max;
    }
}