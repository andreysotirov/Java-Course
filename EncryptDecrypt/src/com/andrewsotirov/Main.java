package com.andrewsotirov;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        String password = scanner.nextLine();
        try {
            FileWriter passFile = new FileWriter("password1.txt");
            FileWriter decryptedFile = new FileWriter("decrypedPass.txt");
            passFile.write("Encypted Pass: " + passEncrypter(password));
            passFile.close();
            decryptedFile.write("Password: " + password);
            decryptedFile.close();
        } catch (IOException e) {

            e.printStackTrace();
        }

    }

    public static String passEncrypter(String pass) {
        try {
            KeyGenerator keygenerator = KeyGenerator.getInstance("DES");
            SecretKey myDesKey = keygenerator.generateKey();

            Cipher desCipher;
            desCipher = Cipher.getInstance("DES");


            byte[] text = pass.getBytes("UTF8");


            desCipher.init(Cipher.ENCRYPT_MODE, myDesKey);
            byte[] textEncrypted = desCipher.doFinal(text);

            String s = new String(textEncrypted);
            return s;

        } catch (Exception e) {
            System.out.println("Exception");
        }
        return null;
    }
}

