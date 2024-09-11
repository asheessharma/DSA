package SlidingWindow;

import java.util.HashMap;

//longest substring with K distinct characters
public class LongSubStrKUniqChar {
    private static void slidingWindow(String str, int k){
        HashMap<Character,Integer> map = new HashMap<>();
        int i = 0;
        int j = 0;
        int n = str.length();
        int max = 0;
        while(j < n){
            char ch = str.charAt(j);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }
            else{
                map.put(ch,1);
            }
            if(map.size()==k){
                max = Math.max(max,(j-i+1));
            }
            if(map.size()>k){

                while(map.size() > k){
                    char temp = str.charAt(i);
                    map.put(temp , map.get(temp)-1);
                    i++;
                    if(map.get(temp)==0){
                        map.remove(temp);
                    }

                }

            }
            j++;
        }
        System.out.println("Maximum length subString with K distinct characters : " + max);
    }

    public static void main(String[] args) {
        slidingWindow("aabacbebebeb" , 3);
    }

}
