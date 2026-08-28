package com.example.basicMaths;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println(reverse(2147483647));
    }
    public static int reverse(int n){
        long reverse = 0;
        while(n>0){
            int lastDigits = n %10;
            reverse = (reverse*10)+lastDigits;
            n/=10;
        }
        if(reverse>Integer.MAX_VALUE || reverse<Integer.MIN_VALUE){
            return 0;
        }
        return (int) reverse;
    }
}
