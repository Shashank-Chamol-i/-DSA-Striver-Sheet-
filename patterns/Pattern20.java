package com.example.patterns;

public class Pattern20 {
    public static void main(String[] args) {
        print(5);
    }
    public static void print(int n){
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=i;j++){
                System.out.print("*");
            }
            for(int k = 2*n; k>2*i;k--){
                System.out.print(" ");
            }
            for(int l = 1;l<=i;l++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = n-1; i>=1;i--){
            for(int j =1; j<=i;j++){
                System.out.print("*");
            }
            for(int k = 2*n; k>2*i;k--){
                System.out.print(" ");
            }
            for(int l = 1;l<=i;l++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
