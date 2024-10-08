package SlidingWindow;

import java.util.HashMap;

//find out the minimum length substring with all characters of t in it, in same frequency.
public class MinWinSubStr {
    private static void MinWindow(String str, String t){
        int i = 0;
        int j = 0;
        int n = str.length();
        int startIndex = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for(int k = 0; k < t.length(); k++){
            char temp = t.charAt(k);
            map.put(temp,map.getOrDefault(temp,0)+1);
        }
        int count = map.size();
        int mini = Integer.MAX_VALUE;
        while(j < n){
            char ch = str.charAt(j);
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch)-1);
                if(map.get(ch) == 0){
                    count--;
                }
            }
            while(count == 0){
                    if((j-i+1)< mini){
                        mini = j-i+1;
                        startIndex = i;
                    }
                    char c = str.charAt(i);
                    if(map.containsKey(c)){
                        map.put(c,map.get(c)+1);
                        if(map.get(c)>0){
                            count++;
                        }
                    }
                    i++;
                }

            j++;
        }
        System.out.println("Minimum Window Size: " + str.substring(startIndex,startIndex+mini));
        System.out.println("Size : " + mini);
    }

    public static void main(String[] args) {
        MinWindow("abaaxcxcabaxxbc","abc");
    }
}
