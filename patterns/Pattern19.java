package com.example.patterns;

public class Pattern19 {
    public static void main(String[] args) {
        print(2);
    }
    public static void print(int n){
       for(int i = 1;i<=n;i++){
           for(int j = (n+1)-i;j>=1;j--){
               System.out.print("*");
           }
           for(int k = 2*i;k>2;k--){
               System.out.print(" ");
           }
           for(int l = (n+1)-i;l>=1;l--){
               System.out.print("*");
           }
           System.out.println();
       }
       for(int i = 1;i<=n;i++){
           for(int j = 1;j<=i;j++){
               System.out.print("*");
           }
           for(int k = 2*n; k>2*i; k--){
               System.out.print(" ");
           }
           for(int k = 1;k<=i;k++){
               System.out.print("*");
           }
           System.out.println();
       }
    }
}
