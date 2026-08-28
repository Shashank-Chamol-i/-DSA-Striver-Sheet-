package com.example.basicMaths;

public class Palindrome extends ReverseNumber{
    public static void main(String[] args) {
        System.out.println(isPalindrome(1221));
    }
    public static boolean isPalindrome(int x){

        if(ReverseNumber.reverse(x) == x ){
            return true;
        }
        return false;
    }
}
