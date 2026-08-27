package com.example.patterns;

public class Pattern5 {
    public static void main(String[] args) {
        print(5);
    }
    public static void print(int n){
        for(int i = n; i>=1;i--){
            for(int j = i; j>=1; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
