package com.example.Arrays;

public class MoveAllZerosToEnd {
    public static void main(String[] args) {
        int[]arr = new int[]{1,0,2,3,2,0,0,4,5,1};
        moveAllZeros(arr);
    }

    // Time complexity  = (N) + (K) = (N+k) NOT SO OPTIMAL
    public static void moveAllZeros(int[]arr){
        int ptr = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[ptr] = arr[i];
                ptr++;
            }
        }
        for(int j = ptr; j<arr.length;j++){
            arr[j] = 0;
        }
        for(int element : arr)
            System.out.print(element+" ");
    }
}
