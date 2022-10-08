package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of arr :");
        int n = sc.nextInt();
        System.out.println("Enter Elements :");

        int[] arr = new int[n];
        for(int i =0;i<n;i++){

            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        System.out.println("Sorted Arr :"+ Arrays.toString(arr));

        System.out.println("Enter Target :");

        int ans=-1;
        int target = sc.nextInt();

        int start =0,end = arr.length;
        while(start<=end){
            int mid = (start+end)/2;
            if (target==arr[mid]){
                ans = mid;
                break;
            }else if(target<arr[mid]){
                end = mid-1;
            }else if (target>arr[mid]){
                start = mid+1;
            }
        }


        if(ans==-1){
            System.out.println("Target is not in arr");
        } else {
            System.out.println("Target is at index position "+ans);
        }
    }
}
