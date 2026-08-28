package com.example.basicMaths;

public class CountDigits {
    public static void main(String[] args) {
        System.out.println(count(12345678));
    }
    public static int count(int n){
        int count = 0;
        while(n!=0){
            int lastDigit = n %10;
            n = n/10;
            count++;
        }
        return count;
    }
}
