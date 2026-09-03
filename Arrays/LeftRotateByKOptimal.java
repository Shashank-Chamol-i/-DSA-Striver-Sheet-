package com.example.Arrays;

public class LeftRotateByKOptimal {
    public static void main(String[] args) {
        int[]arr = new int[]{6,7,8,1,2,3,4,5};
        leftRotate(arr,3);

    }
    public static void leftRotate(int[]arr,int k){
        reverse(arr,0,k-1);
        reverse(arr,k,arr.length-1);
        reverse(arr,0, arr.length-1);

        for(int element : arr)
            System.out.print(element+" ");
    }

    public static void reverse(int[]arr,int start , int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end-- ;
        }
    }
}
