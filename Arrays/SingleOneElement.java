package com.example.Arrays;

public class SingleOneElement {
    public static void main(String[] args) {
        int[]arr = new int[]{1,1,2,3,3,4,4};
        System.out.println(singleOne(arr));
    }
    public static int singleOne(int[]arr){
        int xor = 0;
        for(int i = 0;i<arr.length;i++){
            xor = xor ^ arr[i];
        }
        return xor;
    }
}
