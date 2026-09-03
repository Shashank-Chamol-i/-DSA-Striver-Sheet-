package com.example.Arrays;

public class MoveAllZerosToEndOptimal {
    public static void main(String[] args) {
        int[]arr = new int[]{1,0,2,3,2,0,0,4,5,1};
        moveAllZeros(arr);
    }
    public static void moveAllZeros(int[]arr){
        int ptr = -1;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]==0){
                ptr = i;
                break;
            }
        }
        if(arr[ptr] == -1) return;
        for(int i = ptr+1;i<arr.length;i++){
            if(arr[i]!=0){
                int temp = arr[i];
                arr[i] = arr[ptr];
                arr[ptr] = temp;
                ptr++;
            }
        }
        for(int element : arr)
            System.out.print(element+" ");
    }
}
