package com.example.Recursion;

public class PrintNumberOneToN {
    public static void main(String[] args) {
        print(1,20);
    }
    public static void print(int i , int n){
        if(i>n)
            return ;
        System.out.print(i+" ");
        print(i+1,n);
    }

}
