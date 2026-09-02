package com.example.Arrays;

public class CheckArraySorted {
    public static void main(String[] args) {
        int[]arr = new int[]{1,2,1,3,3,4};
        System.out.println("Array is sorted  :  "+checkArraySorted(arr));
    }
    public static boolean checkArraySorted(int[]arr){
        for(int i = 1;i<arr.length;i++){
            if(arr[i]>=arr[i-1]){

            }else{
                return false;
            }
        }
        return true;
    }
}
