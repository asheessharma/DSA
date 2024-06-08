package TCSDigital2024;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MaxMinCharString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        maxAppearingChar(str);
    }
    private static void maxAppearingChar(String str){
        char [] arr = str.toCharArray();
        HashMap<Character,Integer> map = new HashMap<>();
        int i = 0;
        while( i < arr.length ){
            if(!map.containsKey(arr[i])){
                map.put(arr[i],1);
            }
            else{
               map.put(arr[i],map.get(arr[i])+1);
            }
            i++;
        }
        char maxChar = 'a';
        int maxValue=Integer.MIN_VALUE;
       for(Map.Entry<Character,Integer> entry : map.entrySet()){
           if(entry.getValue()>maxValue){
               maxChar=entry.getKey();
               maxValue= entry.getValue();
           }
       }
        System.out.println("Maximum appearing character in String is : " + maxChar);
    }
}
