package com.example.sorting;

public class OptimizedBubbleSort {
    public static void main(String[] args) {
        int[]arr = new int[]{9 ,13, 20, 24, 46, 52 };
        int n = arr.length;
        int swapOccur = 0;
        for(int i = n-1;i>0;i--){
            for(int j = 0;j<i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapOccur = 1;
                }
            }
            if(swapOccur == 0)
                break;
        }
        for(int x : arr)
            System.out.print(x+" ");
    }
}
