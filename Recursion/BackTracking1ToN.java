package com.example.Recursion;

public class BackTracking1ToN {
    public static void main(String[] args) {
        print(20,20);
    }
    public static void print(int i , int n){
        if(i<1)
            return;
        print(i-1,n);
        System.out.print(i+" ");
    }
}
