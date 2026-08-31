package com.example.sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int[]arr = new int[]{13,46,24,52,20,9};
        int n = arr.length;
        for(int i = 0;i<n;i++){
            int j = i;
            while(j>0 && arr[j-1]>arr[j]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
        for(int element : arr)
            System.out.print(element+" ");
    }
}
