package com.andrewsotirov;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetMain {

    public static void main(String[] args) {
        Set<Integer> squares = new HashSet<>();
        Set<Integer> cubes = new HashSet<>();

        for (int i = 1 ; i <= 100; i++) {
            squares.add(i*i);
            cubes.add(i*i*i);
        }
        System.out.println("There are " + squares.size() + " squares and " + cubes.size() + " cubes.");

        Set<Integer> union = new HashSet<>(squares);
        union.addAll(cubes);
        System.out.println("Union contains " + union.size() + " elements.");

        Set<Integer> intersection = new HashSet<>(squares);
        intersection.retainAll(cubes);
        System.out.println("Intersection contains " + intersection.size() + " elements.");
        for (int i :
                intersection) {
            System.out.println(i + " is the square of " + Math.sqrt(i) + " and cuber of " + Math.cbrt(i));
        }
        Set<String> words = new HashSet<>();
        String sentence = "One day in the year of the fox";
        String[] wordsArray = sentence.split(" ");
        words.addAll(Arrays.asList(wordsArray));

        for (String s :
                words) {
            System.out.println(s);
        }
    }
}
