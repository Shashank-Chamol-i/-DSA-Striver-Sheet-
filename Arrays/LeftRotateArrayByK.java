package com.example.Arrays;

import java.util.ArrayList;
import java.util.List;

public class LeftRotateArrayByK {
    public static void main(String[] args) {
        int[]arr = new int[]{7,6,1,2,3,4,5};
        leftRotate(arr,2);
    }
    public static void leftRotate(int[]arr , int k){
        k = k%arr.length;
        // Putting element from 0 till d into the list :
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0;i<k;i++){
            list.add(arr[i]);
        }

        // loop from k (2)till n(7) and put the element
        for(int j = k; j<arr.length; j++){
            arr[j - k] = arr[j];
        }

        // now n-k (7-2=5) so move from 5 till 7 and store the elements
        int j = 0;
        for(int z = arr.length - k; z < arr.length;z++){
            arr[z] = list.get(j);
            j++;
        }

        for(int element : arr){
            System.out.print(element+" ");
        }

    }
}
