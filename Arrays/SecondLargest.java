package com.example.Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int[]arr = new int[]{1,2,4,7,7,5};
        System.out.println("Second Largest Element in array : "+secondLargest(arr));
    }
    public static int secondLargest(int[]arr){
        int largest;
        int secondLargest =-1;
        largest = arr[0];
        for(int i = 1;i<arr.length;i++){
            if(arr[i]>largest){
                secondLargest = largest;
                largest = arr[i];
            }else{
                if(arr[i]>secondLargest && arr[i]!=largest){
                    secondLargest = arr[i];
                }
            }
        }
        return secondLargest;
    }
}
