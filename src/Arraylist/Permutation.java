package Arraylist;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Permutation {
    public static void main(String[] args) {
        System.out.println(subseqASCII("","abv"));
    }
     private static ArrayList<String> permutation(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> left= permutation(p+up.charAt(0),up.substring(1));
        ArrayList<String> right=permutation(p,up.substring(1));
        left.addAll(right);
        return left;
    }

    private static ArrayList<String> subseqASCII(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> first= subseqASCII(p+ch,up.substring(1));
        ArrayList<String> second=subseqASCII(p,up.substring(1));
        ArrayList<String> third=subseqASCII(p + (ch+0),up.substring(1));
        first.addAll(second);
        first.addAll(third);
        return first;

    }

}
