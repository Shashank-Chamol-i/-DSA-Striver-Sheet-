package com.example.Arrays;

public class LargestElementArray {
    public static void main(String[] args) {
        int[]arr=new int[]{4,3,1,5,2};
        System.out.println("Largest Element in the Arrays is : "+largestArray(arr));
    }
    public static int largestArray(int[]arr){
        int max = 0;
        for(int i = 0;i<arr.length-1;i++){
             max = i;
            if(arr[max]<arr[i]){
                max = i;
            }
        }
        return arr[max];
    }
}
