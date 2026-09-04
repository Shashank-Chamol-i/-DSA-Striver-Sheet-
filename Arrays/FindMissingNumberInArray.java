package com.example.Arrays;

public class FindMissingNumberInArray {
    public static void main(String[] args) {
        int[]arr=new int[]{1,2,3,5};
        System.out.println(findMissingNumber(arr,5));
    }
    public static int findMissingNumber(int[]arr,int N){
        int n = N-1;
        int xor1 = 0 , xor2 = 0;
        for(int i = 0;i<n;i++){
            xor2 = xor2 + arr[i];
            xor1 = xor1 + (i+1);
        }
        xor1 = xor1 ^ N;
        return xor1^xor2;
    }
}
