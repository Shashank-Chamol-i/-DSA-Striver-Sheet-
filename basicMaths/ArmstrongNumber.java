package com.example.basicMaths;

public class ArmstrongNumber {
    public static void main(String[] args) {
        System.out.println(checkArmstrong(153));
    }
    public static boolean checkArmstrong(int n){
        int dup = n;
        int arms = 0;
        while(n>0){
            int lastDigit = n%10;
            n/=10;
            arms = arms+(lastDigit*lastDigit*lastDigit);
        }
        if(arms == dup)
            return true;
        else
            return false;
    }
}
