package com.example.Arrays;

public class LeftRotateArrayByOne {
    public static void main(String[] args) {
        int[]arr = new int[]{6,1,2,3,4,5};
        leftRotate(arr);
    }
    public static void leftRotate(int[]arr){
        int temp = arr[0];
        for(int i = 1;i<arr.length;i++){
            arr[i-1] =arr[i];
        }
        arr[arr.length-1] = temp;
        for(int element : arr)
            System.out.print(element+" ");
    }
}
