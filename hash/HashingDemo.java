package com.example.hash;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class HashingDemo {
    public static void main(String[] args) {
        Integer[]arr = new Integer[]{1,2,3,2,1,5,6,7,8,5,5,2,1};
        Integer[]hash = new Integer[arr.length];
        Arrays.fill(hash,0);
        for(int i = 0;i< hash.length;i++){
            hash[arr[i]]+=1;
        }
        System.out.println("Element : ");

        Stream<Integer> stream = Arrays.stream(arr);
        List<Integer> ls =  stream.collect(Collectors.toList());
        System.out.println(ls);

        System.out.println("Frequency : ");
        Stream<Integer> stream1 = Arrays.stream(hash);
        List<Integer> ls1 = stream1.collect(Collectors.toList());
        System.out.println(ls1);
    }
}
