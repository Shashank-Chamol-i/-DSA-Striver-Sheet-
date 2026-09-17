package com.example.Arrays;

import java.util.ArrayList;
import java.util.List;

public class RearrangeArrayElementBySign {
    public static void main(String[] args) {
        int[]arr = new int[]{3,1,-2,-5,2,-4};
        brute(arr);
        System.out.println();
        optimal(arr);
        System.out.println();
        /*What if the positive and negative are not equal : */
        int[] newArr = {1,-2,3,4,-5,-6,7,8};
        alternativeCase(newArr);
    }
    public static void brute(int[]arr){
    List<Integer> l1 = new ArrayList<>();
    List<Integer> l2 = new ArrayList<>();
    for(int element :arr){
        if(element>0)
            l1.add(element);
        else
            l2.add(element);
    }
    for(int i = 0;i< arr.length/2;i++){
        arr[2*i] = l1.get(i);
        arr[2*i+1] = l2.get(i);
    }
    for (int element : arr)
        System.out.print(element+" ");
    }
    public static void optimal(int[]arr){
        int []newArr = new int[arr.length];
        int even  = 0 ,odd = 1;
        for(int i = 0 ;i<arr.length;i++){

          if(arr[i]>0){
              newArr[even] = arr[i];
              even+=2;
          }else{
              newArr[odd] = arr[i];
              odd+=2;
          }
        }
        for(int element : newArr){
            System.out.print(element+" ");
        }
    }

    public static void alternativeCase(int[]arr){
        List<Integer> ps = new ArrayList<>();
        List<Integer> ng = new ArrayList<>();

        for(int element :arr){
            if(element>0)
                ps.add(element);
            else
                ng.add(element);
        }
        if(ps.size()>ng.size()){
           for(int i =0;i<ng.size();i++){
               arr[2*i] = ps.get(i);
               arr[2*i+1]=ng.get(i);
           }
           for(int j = (ng.size()*2)-1;j<ps.size();j++){
               arr[j]=ps.get(j);
           }
        }else{
            for(int i = 0;i<ps.size();i++){
                arr[2*i] = ng.get(i);
                arr[2*i+1] = ps.get(i);
            }
            for(int j = (ps.size()*2)-1;j<ng.size();j++){
                arr[j] = ng.get(j);
            }
        }

        for(int element : arr)
            System.out.print(element+" ");
    }

}
