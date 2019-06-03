package com.andrewsotirov;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(LetterCapitalize("i love you"));

    }

    public static String LetterCapitalize(String str) {

        String[] words = str.split(" ");
        String upperString = null;
        for (int i = 0; i < words.length; i++) {
            String tempUpperString = words[i].substring(0, 1).toUpperCase();
            upperString = tempUpperString + words[i].substring(1);
        }
        str = upperString;
        return str;
    }
}
