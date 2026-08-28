package com.example.basicMaths;

public class PrintAllDivisor {
    public static void main(String[] args) {
        checkDivisor(36);
    }
    public static void checkDivisor(int n){
        for(int i = 1;i<=36;i++){
            if(n%i == 0)
                System.out.print(i+" ");
        }
    }
}
