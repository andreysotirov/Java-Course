package com.andrewsotirov;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {

    public static void main(String[] args) {

        Map<String, String> languages = new HashMap<>();
        languages.put("Java", "oop best language");
        languages.put("Work", "i need work");
        languages.put("Money", "asd");
        languages.put("Pls", "Please");
        languages.put(":D", "LoL");

        if (languages.containsKey("Java")) {
            System.out.println("Java is already in the map");
        } else {
            languages.put("Java", "Java course");
        }

        System.out.println(languages.get("Java"));

        System.out.println("===================================");

        languages.remove("Money");
        if (languages.remove("Pls", "plspls")) {
            System.out.println("Pls removed");
        } else {
            System.out.println("Pls not removed");
        }
        for (String key :
                languages.keySet()) {
            System.out.println(key + " : " + languages.get(key));
        }
    }
}
