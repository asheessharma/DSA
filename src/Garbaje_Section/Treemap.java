package Garbaje_Section;

import java.util.Map;
import java.util.TreeMap;
// It follows (default) sorting order based on keys. You can redefine sorting order using comparator function.
public class Treemap {
    public static void main(String[] args) {
        TreeMap<Integer,Integer> map = new TreeMap<>();
        map.put(101,110);
        map.put(103,120);
        map.put(102,140);
        map.put(105,150);
        map.put(104,140);
        System.out.println(map);
        for(Map.Entry entry : map.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }
}
