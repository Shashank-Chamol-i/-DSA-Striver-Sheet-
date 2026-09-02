package com.example.Arrays;

public class OptimalRemoveDuplicateFromArray {
    public static void main(String[] args) {
        int[]arr = new int[]{1,1,2,2,3,3,4,4,5,5,6};
        System.out.println(removeDuplicate(arr));
    }
    public static int removeDuplicate(int[]arr){
        int ptr = 0;
        for(int i  = 0;i<arr.length;i++){
            if(arr[i] == arr[ptr]){}
            else{
                arr[++ptr] = arr[i];
            }
        }
        int k = ptr+1;
        for(int j = ptr+1;j<arr.length;j++){
            arr[j] = 0;
        }
        return k;
    }
}
