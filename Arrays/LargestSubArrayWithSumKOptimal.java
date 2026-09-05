package com.example.Arrays;

public class LargestSubArrayWithSumKOptimal {
    public static void main(String[] args) {
        int[]arr= new int[]{1,2,3,1,1,1,1,3,3};
        int k = 6;
        System.out.println("Length of the longest sub array  : "+longestSubArray(arr,k));;
    }
    public static int longestSubArray(int[]arr,int k){
        int left = 0 , right = 0 , maxLen = 0 , n = arr.length;
        long sum = arr[0];
        while(right<n){
            while(left<=right && sum>k){
                sum-=arr[left];
                left++;
            }
            if(sum == k)
                maxLen = Math.max(maxLen,right - left +1);
            right++;
            if(right<n)
                sum+=arr[right];
        }
        return maxLen;
    }
}
