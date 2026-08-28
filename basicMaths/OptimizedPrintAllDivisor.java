package com.example.basicMaths;

import java.util.ArrayList;

public class OptimizedPrintAllDivisor {
    public static void main(String[] args) {
        checkDivisor(36);
    }
    public static void checkDivisor(int n){
        ArrayList list = new ArrayList();
        for(int i = 1;i<=Math.sqrt(n);i++){
            if(n%i == 0) {
                list.add(i);
                if (n / i != i)
                    list.add(n / i);
            }
        }
        list.stream().sorted().forEach(x->System.out.print(x+" "));
    }
}
