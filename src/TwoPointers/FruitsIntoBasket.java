package TwoPointers;
import java.util.*;
public class FruitsIntoBasket {
    private static void twoPointer(int [] arr ){
        int l=0,r=0;
        int maxlen = 0;
        int n = arr.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        while(r < n){
            if(map.containsKey(arr[r])){
                map.put(arr[r],map.get(arr[r])+1);
            }else{
                map.put(arr[r],1);
            }

            if(map.size()>2){
                if(map.containsKey(arr[l])){
                    map.put(arr[l],map.get(arr[l])-1);
                }
                if(map.get(arr[l])==0){
                    map.remove(arr[l]);
                }
                l++;
            }
            if(map.size()<=2){
                maxlen = Math.max(maxlen,r - l + 1);
            }
            r++;
        }
        System.out.println("Maximum Number of fruits : " + maxlen);
    }


    public static void main(String[] args) {
        int [] arr = {1,2,1,1,2,3,2,3,3,1,2};
        twoPointer(arr);
    }

}
