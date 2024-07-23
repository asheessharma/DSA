package TwoPointers;
import  java.util.Scanner;
import java.util.HashMap;

public class MaxSubKDistinctChar { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any String : ");
        String s = sc.nextLine();
        System.out.print("Enter the K's Value : ");
        int k  = sc.nextInt();
        UsingHashMap(s , k);
        usingTwoPointers(s,k);
        optimal(s,k);
    }
    private static void UsingHashMap(String s , int k){
        int max = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0 ; i < s.length() ; i++){
            map.clear();
            for(int j = i ; j < s.length() ;j++){
                if(map.containsKey(s.charAt(j))){
                    map.put(s.charAt(j),map.get(s.charAt(j))+1);
                }else{
                    map.put(s.charAt(j),1);
                }
                if(map.size()<=k){
                    max=Math.max(max,j-i+1);
                }else{
                    break;
                }
            }
        }
        System.out.println("Maximum length subString is: " + max);
    }
    private static void usingTwoPointers(String s , int k){
        int max = 0;
        int l = 0,r=0;
        HashMap<Character,Integer> map = new HashMap<>();
        while(r < s.length()){
            if(map.containsKey(s.charAt(r))){
                map.put(s.charAt(r),map.get(s.charAt(r))+1);
            }else{
                map.put(s.charAt(r),1);
            }
            while(map.size() > k){
                map.put(s.charAt(l),map.get(s.charAt(l))-1);
                if(map.get(s.charAt(l))==0){
                    map.remove( s.charAt(l));
                }
                l=l+1;
            }
            if(map.size()<=k){
                max=Math.max(max,r-l+1);
            }
            r++;
        }
        System.out.println("Maximum length subString is: " + max);
    }
    private static void optimal(String s, int k){
        int max = 0;
        int l = 0,r=0;
        HashMap<Character,Integer> map = new HashMap<>();
        while(r < s.length()){
            if(map.containsKey(s.charAt(r))){
                map.put(s.charAt(r),map.get(s.charAt(r))+1);
            }else{
                map.put(s.charAt(r),1);
            }
           if(map.size() > k){
                map.put(s.charAt(l),map.get(s.charAt(l))-1);
                if(map.get(s.charAt(l))==0){
                    map.remove( s.charAt(l));
                }
                l=l+1;
            }
            if(map.size()<=k){
                max=Math.max(max,r-l+1);
            }
            r++;
        }
        System.out.println("Maximum length subString is: " + max);
    }


}
