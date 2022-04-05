package com.geekbrains;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//Задание 1
        String[] words = {"walk","run","jump","jump","run","walk","idle","fly","swim","walk"};
//1.1
        Set<String> uniq = new HashSet<>(Arrays.asList(words));
        System.out.println(uniq);
//1.2
        Map<String, Integer> map = new HashMap<>();
        for(String word : words){
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        System.out.println(map);
//Задание 2
        Phonebook phone = new Phonebook();
        phone.add("Ivanov", "666");
        phone.add("Petrov", "321");
        phone.add("Ivanov", "123");

        System.out.println(phone.get("Ivanov"));
    }
}
