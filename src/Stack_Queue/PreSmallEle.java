package Stack_Queue;

import java.util.Arrays;
import java.util.Stack;

public class PreSmallEle {
     private static int[] smaller(int [] arr){
         int [] a = new int[arr.length];
         Stack<Integer> s = new Stack<>();
         int i = 0;
         while(i < arr.length){
             while(!s.empty() && s.peek()>=arr[i]){
                 s.pop();
             }
             a[i]=s.empty() ? -1 : s.peek();
             s.push(arr[i]);
             i++;
         }
         return a;
     }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(smaller(new int [] {5,4,6,8,7,9,1})));
    }

}
