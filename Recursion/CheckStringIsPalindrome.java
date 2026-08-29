package com.example.Recursion;

public class CheckStringIsPalindrome {
    public static void main(String[] args) {
         String str = "raceacar";
         int i = 0;
        checkPalindrome(str,str.length()-1,i);
    }
    public static void checkPalindrome(String str , int n,int i ){
        if(i>=n){
            System.out.println("String is Palindrome !");
            return;
        }
        if(str.charAt(n) != str.charAt(i)) {
            System.out.println("String is not Palindrome !");
            return;
        }

        checkPalindrome(str,n-1,i+1);
    }

}
