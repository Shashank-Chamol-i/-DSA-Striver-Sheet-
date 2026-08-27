package com.example.patterns;

public class Pattern16 {
    public static void main(String[] args) {
        print(5);
    }
    public static void print(int n){
        int x = 65;
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=i;j++){
                System.out.print((char)(x-1+i));

            }
            System.out.println();
        }
    }
}
