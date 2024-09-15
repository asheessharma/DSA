package SlidingWindow;

import java.util.HashMap;

//find out the minimum length substring with all characters of t in it, in same frequency.
public class MinWinSubStr {
    private static void MinWindow(String str, String t){
        int i = 0;
        int j = 0;
        int n = str.length();
        HashMap<Character, Integer> map = new HashMap<>();
        for(int k = 0; k < t.length(); k++){
            char temp = t.charAt(k);
            if(map.containsKey(temp)){
                map.put(temp,map.get(temp)+1);
            }
            else{
                map.put(temp,1);
            }
        }
        int count = map.size();
        int mini = 0;
        while(j < n){
            char ch = str.charAt(j);
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch)-1);
            }
            if(map.get(ch) == 0){
                count--;
            }
        }
        if(count == 0){
            mini = Math.min(mini, (j-i+1));
        }

        j++;
    }

    public static void main(String[] args) {

    }
}
