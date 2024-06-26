package TwoPointers;

import java.util.Scanner;

public class MostConsecutiveOnes_3 {
    private static void iterative(int [] arr , int k){
        //k = at-most zeros allowed to flip to max a max len substring
        int maxLen =0 ;
        int len;
        int n = arr.length;
        for(int i = 0 ; i < n ; i++) {
            int zeros = 0;
            for (int j = i; j < n; j++) {
                if (arr[j] == 0) {
                    zeros++;
                }
                if (zeros <= k) {
                    len = j - i + 1;
                    maxLen = Math.max(len, maxLen);
                } else {
                    break;
                }
            }
        }
        System.out.println("Maximum length [using iterative] : " + maxLen);
    }
    private static void usingTwoPointers(int [] arr,int k){
        int l=0,r=0;
        int zeros = 0;
        int maxLen = 0;
        int n = arr.length;
        int len;
        while(r<n){
            if(arr[r] == 0){
                zeros++;
            }
            if(zeros>k){
                while(zeros>=k){
                    if(arr[l]==0){
                        zeros--;
                    }
                    l++;
                }
            }
            len = r-l+1;
            maxLen = Math.max(len,maxLen);
            r++;
        }
        System.out.println("Max length [using two pointers] : " + maxLen);
    }
    private static void optimisedSlidingWindow(int [] arr , int k){
        int l=0,r=0;
        int zeros = 0;
        int maxLen = 0;
        int n = arr.length;
        int len;
        while(r<n){
            if(arr[r] == 0){
                zeros++;

            }
            if(zeros>k){
                if(arr[l]==0){
                    zeros--;
                }
                l++;
            }
            if(zeros<=k){
                len = r - l + 1;
                maxLen = Math.max(len,maxLen);
            }
            r++;
        }
        System.out.println("Max length [using optimised sliding window] : " + maxLen);

    }



    public static void main(String[] args) {
        int [] arr = {1,1,1,1,0,0,0,1,1,1,1,0};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of k : ");
        int k = sc.nextInt();
        iterative(arr,k);
        usingTwoPointers(arr,k);
        optimisedSlidingWindow(arr,k);
    }
}
