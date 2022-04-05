package com.geekbrains;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Phonebook {
    private Map<String, HashSet<String>> map;

    Phonebook(){
        this.map = new HashMap<>();
    }

    void add(String lastname, String phone){
        HashSet<String> numbers;

        if(map.containsKey(lastname)){
            numbers = map.get(lastname);
        } else {
            numbers = new HashSet<>();
        }
        numbers.add(phone);
        map.put(lastname, numbers);
    }

    Set<String> get (String lastname){
        return map.get(lastname);
    }
}
