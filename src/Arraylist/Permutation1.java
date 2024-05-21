package Arraylist;

import java.util.ArrayList;

public class Permutation1 {
    public static void main(String[] args) {
//        permutation("ash","");

        System.out.println(permuList("","ash"));
    }
    private static void permutation(String up , String p){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        for(int i=0;i<=p.length();i++){
            String f=p.substring(0,i);
            String s=p.substring(i,p.length());
            permutation(up.substring(1),f+ch+s);
        }
    }
    private static ArrayList<String> permuList(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch= up.charAt(0);
        ArrayList<String > ans=new ArrayList<>();
        for(int i=0;i<=p.length();i++){
            String f=p.substring(0,i);
            String s = p.substring(i,p.length());
            ans.addAll(permuList(f+ch+s,up.substring(1)));
        }
        return ans;
    }

}
