package com.example.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[]arr = new int[]{6,7,8,4,1};
        System.out.println("Position of Element in Index : "+linearSearch(arr,4));
    }
    public static int linearSearch(int[]arr,int element){
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == element){
                return i;
            }
        }
        return -1;
    }
}
