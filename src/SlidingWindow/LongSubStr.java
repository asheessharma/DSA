package SlidingWindow;
//Longest SubString Without Repeating characters. All characters should be unique.

import java.util.HashMap;
public class LongSubStr {
    private static int  maxString(String str){
        int i = 0;
        int j = 0;
        int n = str.length();
        HashMap<Character,Integer> map = new HashMap<>();
        int max = 0;
        while(j < n){
            char ch = str.charAt(j);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else{
                map.put(ch,1);
            }

            if(map.size() == (j-i+1)){
                max = Math.max(max,(j-i+1));
            }
            if((j-i+1) > map.size()){
                while(map.size()< (j-i+1)){
                    char temp = str.charAt(i);
                    map.put(temp,map.get(temp)-1);
                    if(map.get(temp)==0){
                        map.remove(temp);
                    }
                    i++;
                }
            }
            j++;

        }
        return max;

    }

    public static void main(String[] args) {
        System.out.println(maxString("ashissrma"));
    }
}
