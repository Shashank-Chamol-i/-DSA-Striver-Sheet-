package com.example.sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int[]arr = new int[]{13,46,24,52,20,9};
        int n = arr.length;
        for(int i = n-1;i>0;i--){
            for(int j = 0;j<i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int x : arr)
            System.out.print(x+" ");
    }
}
