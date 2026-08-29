package com.example.Recursion;

public class FibonacciSeries {
    public static void main(String[] args) {
        System.out.println(fibo(6));
    }
    public static int fibo(int n){
        if(n<=1)
            return n;
        int last = fibo(n-1);
        int secLast = fibo(n-2);
        return last + secLast;
    }
}
