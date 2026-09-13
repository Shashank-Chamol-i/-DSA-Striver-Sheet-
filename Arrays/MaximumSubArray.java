package com.example.Arrays;

public class MaximumSubArray {
    public static void main(String[] args) {
        int[]arr = new int[]{-2,-3,4,-1,-2,1,5,-3};
        System.out.println(bruteForce(arr));
        System.out.println(better(arr));
        System.out.println(optimal(arr));
    }
    public static int bruteForce(int[]arr){
        int maximum = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++){
            for(int j = i;j<arr.length;j++){
                int sum = 0;
                for(int k = i;k<j;k++){
                    sum+=arr[k];
                    maximum = Math.max(sum,maximum);
                }
            }
        }
        return maximum;
    }
    public static int better(int[]arr){
        int maximum = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++){
            int sum = 0;
            for(int j  = i;j<arr.length;j++){
                sum+=arr[j];
                maximum = Math.max(sum,maximum);
            }
        }
        return maximum;
    }
    public static int optimal(int[]arr){
        int sum = 0;
        int maximum = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++){
           sum+=arr[i];
           maximum = Math.max(sum,maximum);
           if(sum<0)
               sum = 0;
        }
        return maximum;
    }
}
