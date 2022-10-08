package com.company;
import java.util.Scanner;

public class HillCipher {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Plain Text : ");
        String message = sc.next();
        System.out.println("Enter Key : ");
        String key = sc.next();

        int[][] keyMatrix = new int[3][3];
        int k = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                keyMatrix[i][j] = (key.charAt(k)) % 65;
                k++;
            }
        }

        int[][] messageVector = new int[3][1];

        for (int i = 0; i < 3; i++) {
            messageVector[i][0] = (message.charAt(i)) % 65;
        }
        int[][] cipherMatrix = new int[3][1];

        int x, i, j;
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 1; j++) {
                cipherMatrix[i][j] = 0;

                for (x = 0; x < 3; x++) {
                    cipherMatrix[i][j] += keyMatrix[i][x] * messageVector[x][j];
                }
                cipherMatrix[i][j] = cipherMatrix[i][j] % 26;
            }
        }

        String CipherText = "";

        for (int z = 0; z < 3; z++)
            CipherText += (char) (cipherMatrix[z][0] + 65);

        System.out.print("Ciphertext : " + CipherText);
    }
}
