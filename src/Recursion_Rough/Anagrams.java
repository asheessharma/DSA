package Recursion_Rough;

import java.util.Arrays;
import java.util.HashMap;

public class Anagrams {
    private static void UsingWindow(String str, String subStr){
        if(subStr.length() > str.length() || subStr.length() == 0){
            System.out.println("Invalid");
            return;
        }
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        for(int i = 0 ; i < subStr.length(); i++){
            char ch = subStr.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else{
                map.put(ch,1);
            }
        }
        int i = 0 , j = 0;
        int count = map.size();
        int ans = 0;
        int n = str.length();
        int m = subStr.length();
        while(j < n){
            char ch = str.charAt(j);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)-1);
                if(map.get(ch) == 0){
                    count--;
                }
            }
            if((j - i + 1) < m){
                j++;
                continue;
            }
            if((j - i + 1) == m){
                if(count==0) {
                    ans++;
                }
                if(map.containsKey(str.charAt(i))){
                    int val = map.get(str.charAt(i));
                    if(val == 0){
                        count++;
                    }
                    map.put(str.charAt(i) , ++val);
                }
                i++;
                j++;
            }
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        UsingWindow("aabaabbabbaba","aaba");
    }

}
