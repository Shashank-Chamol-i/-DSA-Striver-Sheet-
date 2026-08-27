package com.example.patterns;

public class Pattern9 {
    public static void main(String[] args) {
        print(5);
    }
    public static void print(int n ){
        for(int i = 0;i<n;i++){
            for(int j = n-i-1; j>0;j--){
                System.out.print(" ");
            }
            for(int k = (2*i)+1; k>0;k--){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = n;i>0;i--){
            for(int j = n-i-1;j>=0;j--){
                System.out.print(" ");
            }
            for(int k = (2*i)-1;k>0;k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
