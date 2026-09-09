package com.example.Arrays;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSumBetterAndOptimalApproach {
    public static void main(String[] args) {
        int[]arr= new int[]{2,6,5,8,11};
        int target = 14;
        twoSum(arr,target);
        optTwoSum(arr,target);
    }
    public static void twoSum(int[]arr , int target){
        HashMap<Integer,Integer> map = new HashMap<>();
        int required = 0;
        for(int i = 0;i<arr.length;i++){
            required = target - arr[i];
                if(map.containsKey(required)){
                    System.out.println("Indices are : { "+map.get(required)+" , "+i+" }");
                }
            else{
                map.put(arr[i],i);
            }

        }
    }
    public static void optTwoSum(int[] arr, int target){
        Arrays.sort(arr);
        int left = 0 , right = arr.length -1;

        while(left<right){
            if(arr[left] + arr[right] == target){
                System.out.println("After Sorting the arrays Indices are : { "+left +" , "+right+" }");
                break;
            }
          else if(arr[left]+arr[right] < target){
              left++;
          }
          else if(arr[left]+arr[right]>target){
              right--;
          }

        }

    }

}
