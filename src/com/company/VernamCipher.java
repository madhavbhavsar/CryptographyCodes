package com.company;
import java.util.Scanner;

public class VernamCipher {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Plain Text  :");
        String plainText = sc.next();
        System.out.println("Enter Key :");
        String key = sc.next();

        String cipherText = "";
        int cipher[] = new int[key.length()];

        for (int i = 0; i < key.length(); i++) {
            cipher[i] = plainText.charAt(i) - 'A' + key.charAt(i) - 'A';
        }
        for (int i = 0; i < key.length(); i++) {
            if (cipher[i] > 25) {
                cipher[i] = cipher[i] - 26;
            }
        }

        for (int i = 0; i < key.length(); i++) {
            int x = cipher[i] + 'A';
            cipherText += (char)x;
        }

        System.out.println("Cipher Text : " + cipherText);
    }
}
