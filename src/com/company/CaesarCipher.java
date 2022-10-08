package com.company;
import java.util.Scanner;

public class CaesarCipher {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string :");
        String ss = sc.next();
        System.out.println("Enter number :");
        int n = sc.nextInt();

        String ns = "";
        for (int i=0; i<ss.length(); i++) {
            if (Character.isUpperCase(ss.charAt(i))) {
                char ch = (char)(((int)ss.charAt(i) + n - 65) % 26 + 65);
                ns+=ch;
            }
            else {
                char ch = (char)(((int)ss.charAt(i) + n - 97) % 26 + 97);
                ns+=ch;
            }
        }
        System.out.println("Cypher string :");
        System.out.println(ns);
    }
}
