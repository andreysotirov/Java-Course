package com.andrewsotirov;

public class Password {

    private static final int key = 78945574;
    private final int encryptedPassword;

    public Password(int password) {
        this.encryptedPassword = encryptDecrypt(password);
    }

    private int encryptDecrypt(int password) {
        return password ^ key;
    }

    public void storePassword(){
        System.out.println("Password saved " + encryptedPassword);
    }

    public boolean letMeIn(int password){
        if (encryptDecrypt(password) == encryptedPassword) {
            System.out.println("Welcome");
            return true;
        }else {
            System.out.println("You can't enter");
            return false;
        }
    }
}
