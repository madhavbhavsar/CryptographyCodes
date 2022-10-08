package com.company;
import java.util.Scanner;

public class RailfenceCipher {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String : ");
        String plainText = sc.next();

        System.out.println("Enter Depth(integer) : ");
        int depth = sc.nextInt();

        int r=depth,len=plainText.length();
        int c=len/depth;
        char mat[][]=new char[r][c];
        int k=0;

        String cipherText="";

        for(int i=0;i< c;i++) {
            for(int j=0;j< r;j++) {
                if(k!=len)
                    mat[j][i]=plainText.charAt(k++);
                else
                    mat[j][i]='X';
            }
        }
        for(int i=0;i< r;i++) {
            for(int j=0;j< c;j++) {
                cipherText+=mat[i][j];
            }
        }
        System.out.println("Cipher text is : \n"+cipherText);
    }
}
