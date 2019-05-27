package com.andrewsotirov;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Animal animal = new Animal("Animal", 1, 1, 5, 5);

        Dog dog = new Dog("Naq", 10, 40, 4, 2, 1, 38, "Short Smooth");

        dog.eat();
        dog.walk();
        dog.run();
    }
}
