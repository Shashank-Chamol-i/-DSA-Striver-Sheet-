package com.example.Recursion;

public class SumOfFirstNNumbers {
    public static void main(String[] args) {
        System.out.println(son(10));
    }
    public static int son(int n){
        if(n < 1)
            return 0;
        return (n+son(n-1));
    }
}
