package com.example.sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int[]arr = new int[]{13,46,24,52,20,9};
        int n = arr.length;
        for(int i = 0;i<n-1;i++){
            int min = i;
            for(int j = i;j<n;j++){
                if(arr[j]<arr[min]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        for(int element : arr)
            System.out.print(element+" ");
    }

}
