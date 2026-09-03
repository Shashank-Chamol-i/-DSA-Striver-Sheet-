package com.example.Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UnionAndIntersection {

    public static void main(String[] args) {
        int[] arr1 = {1, 1, 2, 3, 4, 5};
        int[] arr2 = {2, 3, 4, 4, 5, 6};

        union(arr1, arr2);
        intersection(arr1,arr2);
    }
    public static void intersection(int[]arr1 , int[]arr2){
        ArrayList<Integer> list = new ArrayList<>();
        int n1 = arr1.length;
        int n2 = arr2.length;
        int i =0 ,j = 0;
        while(i<n1 && j <n2){
            if(arr1[i]<arr2[j]){
                i++;
            }
            else if(arr1[i]>arr2[j]){
                j++;
            }
            else{
                list.add(arr1[i]);
                i++;
                j++;
            }
        }
        List<Integer> result = list.stream().collect(Collectors.toList());
        System.out.println(result);

    }

    public static void union(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int i = 0 , j=0;
        ArrayList<Integer> list = new ArrayList<>();

        while(i < n1 && j < n2 ){
            if(arr1[i]<arr2[j]){
                if(list.isEmpty() || list.get(list.size()-1) != arr1[i]){
                    list.add(arr1[i]);
                }
                i++;
            }else{
                if(list.isEmpty() || list.get(list.size()-1) !=arr2[j]){
                    list.add(arr2[j]);
                }
                j++;
            }
        }
        while(i<n1){
            if(list.isEmpty() || list.get(list.size()-1) !=arr1[i]){
                list.add(arr1[i]);
            }
            i++;
        }
        while(j<n2){
            if(list.isEmpty() || list.get(list.size()-1) !=arr2[j]){
                list.add(arr2[j]);
            }
            j++;
        }

        for(int element : list)
            System.out.print(element+" ");
        System.out.println();
    }
}
