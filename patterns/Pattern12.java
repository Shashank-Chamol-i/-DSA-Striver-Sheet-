package com.example.patterns;

public class Pattern12 {
    public static void main(String[] args) {
        print(5);
    }
    public static void print(int n ){
        int x = n;
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=i;j++){
                System.out.print(j);
            }
            for(int k = (2*x)-2;k>=1;k--){
                System.out.print(" ");
            }
            for(int l = i; l>=1;l--){
                System.out.print(l);
            }
            System.out.println();
            x--;
        }
    }
}
