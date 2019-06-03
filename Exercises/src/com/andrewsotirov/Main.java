package com.andrewsotirov;

import java.sql.Struct;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println(spinWords("Hey fellow warriors"));
    }

    public static String spinWords(String sentence) {

        String[] words = sentence.split(" ");

        String reverseWord = "";

        for (int i = 0; i < words.length; i++) {

            if (words[i].length() > 4) {
                char[] chars = words[i].toCharArray();
                for (int j = chars.length - 1; j >= 0; j--) {
                    reverseWord += Character.toString(chars[j]);
                }
                words[i] = reverseWord;
            }
        }
        return String.join(" ", words);
    }
}
