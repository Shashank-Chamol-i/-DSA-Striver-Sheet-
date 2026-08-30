package com.example.hash;

import java.util.HashMap;
import java.util.Map;


public class MapHash {
    public static void main(String[] args) {
        int[]arr = new int[]{1,2,1,1,3,2,4,1,5,1,2,6,7,7,8,9,9,5,4,2,3,4,2,2,4,5,6,1,4,1,4,2,7};
        Map<Integer,Integer> map = new HashMap<>();

        for(int i = 0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
         map.entrySet().stream().forEach(System.out::println);
    }
}
