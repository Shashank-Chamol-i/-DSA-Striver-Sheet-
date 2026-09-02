package com.example.Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicateFromArray {
    public static void main(String[] args) {
        int[]arr = new int[]{1,1,2,2,3,3,4,4,5,5,6};
         arr = removeDuplicate(arr);
         for(int element : arr){
             System.out.print(element+" ");
         }

    }
    public static int[] removeDuplicate(int[]arr){
        HashSet<Integer> hashSet = new HashSet<>();
        for(int i = 0;i<arr.length;i++){
            hashSet.add(arr[i]);
        }
        Arrays.fill(arr,0);
        int x = 0;
        for(int element : hashSet){
            arr[x] = element;
            x++;
        }

        return arr;
    }
}
