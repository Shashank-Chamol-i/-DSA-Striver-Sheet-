package com.example.basicMaths;

public class CheckPrimeNumber {
    public static void main(String[] args) {
        System.out.println(checkPrimeNumber(83));
    }
    public static boolean checkPrimeNumber(int n){
        int count = 0;
        for(int i = 1; i*i<=n;i++){
            if(n%i == 0){
                count++;
                if(n/i != i)
                    count++;
            }
        }
        if(count == 2)
            return true;
        else
            return false;
    }
}
