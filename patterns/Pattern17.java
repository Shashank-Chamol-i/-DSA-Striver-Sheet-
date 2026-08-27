package com.example.patterns;

public class Pattern17 {
    public static void main(String[] args) {
        print(5);
    }
    public static void print(int n ){
        int x = 65;
        for(int i = 1;i<=n;i++){
            for(int j = n-i;j>=1;j--){
                System.out.print(" ");
            }
            for(int k = 1;k<=i;k++){
                System.out.print((char)(x-1+k));
            }
            for(int l = i-1; l>=1;l--){
                System.out.print((char)(x-1+l));
            }
            System.out.println();
        }
    }
}
