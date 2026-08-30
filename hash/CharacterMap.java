package com.example.hash;

import javax.swing.text.html.Option;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class CharacterMap {
    public static void main(String[] args) {
       String str = "akfjksjfkjkjfiwhpithkjnhffhifhfiuauthnhvuhgwhjwhgwunhouhowunhvuxwhufougnhwou";
       char[]arr = str.toCharArray();
        Map<Character,Integer> map = new HashMap<>();

        for(int i = 0;i<str.length();i++){
            map.put(str.charAt(i),map.getOrDefault(arr[i],0)+1);
        }

        System.out.println("Elements with Frequencies : ");
        map.entrySet().stream().forEach(System.out::println);
        System.out.println();
        Optional<Map.Entry<Character,Integer>> en = map.entrySet().stream().max((s1, s2)-> s1.getValue().compareTo(s2.getValue()));
        System.out.println("Maximum Element : "+en.get());
    }
}
