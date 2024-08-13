package Stack_Queue;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {
    private static int[] nextGreaterArr(int [] arr){
        int [] ans = new int[arr.length];
        int n = arr.length;
        Stack<Integer> s = new Stack<>();
        for(int i = n-1 ; i >= 0 ; i--){
            while(!s.empty() && s.peek() <= arr[i]){
                s.pop();
            }
            if(s.empty()){
                ans[i]=-1;
            }else{
                ans[i]=s.peek();
            }
            s.push(arr[i]);
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(nextGreaterArr(new int[]{6,4,3,7,8,1,9,10})));
    }

}
