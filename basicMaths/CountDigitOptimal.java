package com.example.basicMaths;

public class CountDigitOptimal {
    public static void main(String[] args) {
        System.out.println(count(1000545));
    }
    public static int count(int n){
        return (int) Math.log10(n)+1;
    }
}
