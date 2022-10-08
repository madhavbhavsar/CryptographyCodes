package com.company;
import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of arr :");
        int n = sc.nextInt();
        System.out.println("Enter Elements :");

        int[] arr = new int[n];
        for(int i =0;i<n;i++){

            arr[i] = sc.nextInt();
        }

        System.out.println("Enter Target :");
        int ans=-1;
        int target = sc.nextInt();
        for(int i =0;i<arr.length;i++){
            if(arr[i]==target){
                ans = i;
                break;
            }
        }

        if(ans==-1){
            System.out.println("Target is not in arr");
        } else {
            System.out.println("Target is at index position "+ans);
        }
    }
}
