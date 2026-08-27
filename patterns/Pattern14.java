package com.example.patterns;

public class Pattern14 {
    public static void main(String[] args) {
        print(4);
    }
    public static void print(int n){
        char x = 65;
        for(int i= 1;i<=n;i++){
            for(int j = 1;j<=i;j++){
                System.out.print((char)((x*2)-(x+1)+j)+" ");

            }

            System.out.println();
        }
    }
}
