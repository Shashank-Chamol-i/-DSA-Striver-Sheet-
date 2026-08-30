package com.example.hash;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CharacterHashing {
    public static void main(String[] args) {
        Character[]arr = new Character[]{'a','a','b','d','z','x','g','d','d','v','v','g','g'};
        Integer[]hash = new Integer[256];
        Arrays.fill(hash,0);

        for(int i = 0;i< arr.length;i++){
            hash[(arr[i] )]+=1;
        }
        System.out.println("Elements : ");
        Stream<Character> stream = Arrays.stream(arr);
        List<Character> cls =  stream.collect(Collectors.toList());
        System.out.println(cls);
        System.out.println("Frequency : ");
        Stream<Integer> stream1 = Arrays.stream(hash);
        List<Integer> ls = stream1.toList();
        System.out.println(ls);
    }
}
