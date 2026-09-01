package com.example.sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[]arr = new int[]{13,46,24,52,20,9};
        int low = 0;
        int high = arr.length-1;
        quickSort(arr,low,high);
        System.out.println(Arrays.toString(arr));
    }
    public static void quickSort(int[]arr,int low , int high){
        if(low<high){
            int partitionIndex = partition(arr,low,high);
            quickSort(arr,low, partitionIndex -1);
            quickSort(arr,partitionIndex+1,high);
        }
    }
    public static int partition(int[]arr,int low , int high){
        int pivot = arr[low];
        int i = low;
        int j = high;
        while(i<j){
            while(i<=high && arr[i]<=pivot){
                i++;
            }
            while(j>=low && arr[j]>pivot){
                j--;
            }
            if(i<j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;

        return j;
    }
}
