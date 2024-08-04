package Garbaje_Section;

import java.util.*;
// we use Map.Entry interface to iterate over hashmap

public class HashMapIteration {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map = new HashMap();
        map.put(1 , 10);
        map.put(2 , 20);
        map.put(3 , 30);
        map.put(4 , 40);
        map.put(5 , 50);
        System.out.println(map);
//        Set set = map.entrySet();
//        Iterator itr = set.iterator();
//        while(itr.hasNext()){
//            System.out.println(itr.next());
//        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() +" :=> "+ entry.getValue());

        }


    }
}
