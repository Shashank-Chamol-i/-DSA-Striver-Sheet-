package com.example.Arrays;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        int[]arr = new int[]{2,2,3,3,1,2,2};
        System.out.println(bruteForce(arr));
        System.out.println(better(arr));
         System.out.println(optimal(arr));
    }
    public static int bruteForce(int[]arr){
        for(int i = 0;i<arr.length;i++){
            int count = 0;
            for(int j = 0;j<arr.length;j++){
                if(arr[i] == arr[j])
                    count++;
                if(count > arr.length/2)
                    return arr[j];
            }
        }
        return -1;
    }
    public static int better(int[]arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<arr.length;i++){
            if(map.isEmpty())
                map.put(arr[i],1);
            else{
                map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            }
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() > arr.length/2)
                return entry.getKey();
        }

        return -1;
    }
    public static int optimal(int[]arr){
        int element = 0;
        int count = 0;
        for(int i = 0;i<arr.length;i++){
            if(count == 0){
                element = arr[i];
                count++;
            }
            else if(element == arr[i])
                count++;
            else
                count--;
        }
        int count1 = 0;
        for(int i = 0;i<arr.length;i++){
            if(element == arr[i])
                count1++;

            if(count1 > arr.length/2)
                return element;
        }
        return -1;
    }
}
