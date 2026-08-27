package com.example.patterns;

public class Pattern18 {
    public static void main(String[] args) {
        print(5);
    }
    public static void print(int n){
        int x = 65;
        for(int i = 1;i<=n;i++){
            for(int j = n -i;j<n;j++){
                System.out.print((char)(x+j));
            }
            System.out.println();
        }
    }
}
