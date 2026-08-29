package com.example.Recursion;

public class PrintNumberFromNToOne {
    public static void main(String[] args) {
        print(20);
    }
    public static void print(int n){
        if(n == 0)
            return;
        System.out.print(n+" ");
        print(n-1);
    }
}
