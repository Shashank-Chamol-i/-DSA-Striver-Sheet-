package com.example.Arrays;

public class MaximumConsecutiveOnes {
    public static void main(String[] args) {
        int[]arr = new int[]{1,0,1,1,0,1};
        System.out.println(consecutiveOne(arr));
    }
    public static int consecutiveOne(int[]arr){
        int maxCount = 0 , count = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == 1){
                count++;
                maxCount = Math.max(count,maxCount);
            }else{
                count = 0;
            }
        }

        return maxCount;
    }
}
