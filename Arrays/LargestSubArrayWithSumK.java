package com.example.Arrays;

import java.util.HashMap;

public class LargestSubArrayWithSumK {
    public static void main(String[] args) {
        int[]arr = new int[]{1,2,3,1,1,1,1,4,1,3};
        int k = 3;
        System.out.println(largestSubArray(arr,k));;
    }
    public static int largestSubArray(int[]arr, int k){
        HashMap<Integer,Integer> map = new HashMap<>();
        int preSum = 0;
        int maxLen = 0;
        for(int i = 0;i<arr.length;i++){
            preSum+=arr[i];

            if(preSum == k)
                maxLen=i+1;
            if(map.containsKey(preSum - k)){
                int len  = i - map.get(preSum - k);
                maxLen = Math.max(maxLen,len);
            }
            if(!map.containsKey(preSum - k))
                map.put(preSum,i);
        }
        return maxLen;
    }
}
