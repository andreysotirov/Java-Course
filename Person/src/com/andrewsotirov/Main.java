package com.andrewsotirov;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Person person = new Person();
        person.setAge(32);
        person.setFirstName("Andrew");
        person.setLastName("");
        System.out.println(person.getAge());
        System.out.println(person.getFullName());
    }
}
