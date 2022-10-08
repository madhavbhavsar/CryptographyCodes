package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class VignereCipher {
    public static void main(String[] args) {

        char vignereTable[][]= new char[26][26];
        Scanner console = new Scanner(System.in);
        System.out.println("Enter a text key in lower case");
        String key = console.nextLine();

        char alpharray[] = new char[26];
        char c = 'a';
        for(int x=0;x<26;x++){
            alpharray[x] = c;
            c++;
        }

        int i,j,k;
        i = 0;
        while(i < 26) {
            k = i;
            for (j=0;j < 26;j++) {
                if (k >= 26){
                    k=0;
                }
                vignereTable[i][j] = alpharray[k++];
            }
            i++;
        }

        for (int l = 0; l < vignereTable.length; l++) {

            for (int m = 0; m < vignereTable[l].length; m++) {
                System.out.print(vignereTable[l][m]+" ");
            }
            System.out.println();


        }


        System.out.println("Enter the plain text");
        String plainText = console.nextLine();

        char[] plainTextArr = plainText.toCharArray();
        while(key.length() < plainText.length())
        {
            key += key;
        }
        key = key.substring(0,plainText.length());
        System.out.println(key);
        char [] keyArray = key.toCharArray();
        String cipherText = "";
        for(int p=0; p < plainText.length();p++)
        {
            int rowpos = keyArray[p]-'a';
            int colpos = plainTextArr[p]-'a';
            cipherText += vignereTable[rowpos][colpos];
        }

        System.out.println("The encrypted text is "+cipherText);

    }

}
