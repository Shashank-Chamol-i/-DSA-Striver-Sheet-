package com.example.Recursion;

public class ReverseOfArray {

    public static void main(String[] args) {
        int[]arr = {10,20,30,40,50,60};
        int i = 0;
        roa(arr, arr.length-1,i);
        for(int x : arr)
            System.out.print(x+" ");
    }
    public static void roa(int[]arr,int n,int i){
        if(i>=n)
            return;
        int temp = arr[n];
        arr[n] = arr[i];
        arr[i] = temp;
        roa(arr,n-1,i+1);
    }
}
