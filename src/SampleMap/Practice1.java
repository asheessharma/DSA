package SampleMap;

import java.util.*;

public class Practice1 {
    public static void addLast(int d,Stack<Integer>s){
        if(s.isEmpty()){
            s.push(d);
            return;
        }
        int data=s.pop();
        addLast(d,s);
        s.push(data);
    }
    public static void reverse(Stack<Integer>s){
        if(s.isEmpty()){
            return;
        }
        int top=s.pop();
        reverse(s);
        addLast(top,s);
    }
    public static void sortLl(LinkedList<Integer> ll){
        int count0=0;
        int count1=0;
        int count2=0;

    }
    public static void main(String[] args) {
//        HashMap<String,Integer> map=new HashMap<>();
//        map.put("ashish",1);
//        map.put("sharma",2);
//        map.put("antony",3);
//
//        map.put("anmol",4);
//        map.put("prashant",5);
//
//
//        HashSet<Integer> set=new HashSet<>();
//        set.add(1);
//        set.add(3);
//        set.add(2);
//        set.add(7);
//        Iterator<Integer> it=set.iterator();
//        while(it.hasNext()){
//            System.out.println(it.next());
//
//        }
//        System.out.println(set.contains(8));
//        for(Map.Entry<String,Integer> e:map.entrySet()){
//            System.out.println(e.getKey() + " : " + e.getValue());
//        }
//        LinkedList<String> list=new LinkedList<String>();
//        list.addFirst("ashish");
//        list.add("sharma");
//        list.addLast("is");
//        list.addFirst("Engineer");
//        list.add("zzz");
//        list.add("yyy");
//        System.out.println(list.getLast());
//        for(int i=0;i<list.size();i++){
//            System.out.println(list.get(i));
//        }
//        System.out.println(list);
        Stack<Integer> stk=new Stack<>();
        stk.push(1);
        stk.push(2);
        stk.push(3);
        stk.push(4);
//        addLast(5,stk);
        reverse(stk);
//        while(!stk.isEmpty()){
//            System.out.println(stk.peek());
//            stk.pop();
//        }

    }
}
