package com.example.patterns;

public class Pattern15 {
    public static void main(String[] args) {
        print(5);
    }
    public static void print(int n){
        int x = 65;
        for(int i = n;i>=1;i--){
            for(int j = 1; j<=i;j++){
                System.out.print((char)(x-1+j));
            }
            System.out.println();
        }
    }
}
