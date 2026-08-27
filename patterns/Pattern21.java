package com.example.patterns;

public class Pattern21 {
    public static void main(String[] args) {
        print(10);
    }
    public static void print(int n){
        for(int i = 1;i<=n;i++){
            if(i == 1 || i == n){
                for(int j= 1;j<=n;j++){
                    System.out.print("*");
                }
            }else{
                System.out.print("*");
                for(int k = 1;k<=(n-2);k++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
