package TCSDigital2024;

import java.util.Arrays;

import java.util.Scanner;

public class AnagramStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first string : ");
        String str1 = sc.next();

        System.out.print("Enter the next string : ");
        String str2 = sc.next();
        if(isAnagram(str1,str2)){
            System.out.println("******* Strings are anagrams *******");
        }
        else{
            System.out.println("Try another pair....");
        }
    }
    private static boolean isAnagram(String str , String str1){
        if(str.length() != str1.length()) return false;
        char [] temp1 = str.toCharArray();
        char [] temp2 = str1.toCharArray();
        int [] arr1 = new int[256];
        Arrays.fill(arr1,0);

        int [] arr2 = new int[256];
        Arrays.fill(arr2,0);

        for(int i=0;i<temp1.length ;i++){
            arr1[temp1[i]]++;
            arr2[temp2[i]]++;
        }

        for(int i=0;i<256;i++){
            if(arr1[i]!=arr2[i]) return false;
        }
        return true;
    }
}
