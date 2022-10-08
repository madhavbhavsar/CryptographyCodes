package com.company;
import java.util.Scanner;

public class MonoalphabeticCipher {

    public static void main(String[] args) {

        String key = "qwertyuiopasdfghjklzxcvbnm";
        String alphabets =   "abcdefghijklmnopqrstuvwxyz";

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string :");
        String ss = sc.next();

        String ns = "";

        for(int i =0;i<ss.length();i++){

            int ind= alphabets.indexOf(ss.charAt(i));
            ns += String.valueOf( key.charAt(ind));

        }
        System.out.println("Cypher string :");
        System.out.println(ns);

    }

}
