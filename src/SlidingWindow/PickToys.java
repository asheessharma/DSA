package SlidingWindow;

import java.util.HashMap;
import java.util.Map;

//same as Longest substring with k distinct characters.
//you can pick n no of toys of 2 types only.
public class PickToys {
    private  static void pickToys(String str , int k){
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
            if(map.size()<k){
                j++;
                continue;
            }
            if(map.size() == k){
                max = Math.max(max, (j-i+1));
            }
            if(map.size()>k){
                while(map.size() > k){
                    char temp = str.charAt(i);
                    map.put(temp, map.get(temp)-1);
                    if(map.get(temp) == 0){
                        map.remove(temp);
                    }
                    i++;
                }
            }
            j++;
        }
        System.out.println("Maximum number of toys you can pickup is : "+ max);
    }

    public static void main(String[] args) {
        pickToys("assssaahhiiississaa",2);
    }
}
