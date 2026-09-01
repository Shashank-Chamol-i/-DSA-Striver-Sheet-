package com.example.sorting;

import java.util.ArrayList;

public class MergeSort {
    public static void main(String[] args) {
        int[]arr = new int[]{5,3,1,2,4};
        int low = 0;
        int high = arr.length-1;
        mergeSort(arr,low, high);
        for(int element : arr)
            System.out.print(element+" ");
    }
    public static void mergeSort(int[]arr, int low , int high){
        if(low==high)
            return;
        int mid = (low+high)/2;
        mergeSort(arr, low , mid);
        mergeSort(arr,mid+1,high);
        mergeArray(arr,low,mid,high);
    }
    public static void mergeArray(int[]arr, int low , int mid ,int high){
        ArrayList <Integer> list = new ArrayList();
        int left = low;
        int right = mid+1;
        while(left<=mid &&  right<=high){
            if(arr[left]<=arr[right]){
                list.add(arr[left]);
                left++;
            }else{
                list.add(arr[right]);
                right++;
            }
        }
        while(left<=mid){
            list.add(arr[left]);
            left++;
        }
        while(right<=high){
            list.add(arr[right]);
            right++;
        }
        for(int i = low;i<=high;i++){
            arr[i] = list.get(i-low);
        }
    }
}
