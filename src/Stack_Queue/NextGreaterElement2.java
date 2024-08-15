package Stack_Queue;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement2 {
    private static int[] findElement(int [] arr){
        int [] array = new int[arr.length];
        int n = arr.length;
        int i = 2 * n - 1;
        Stack<Integer> s = new Stack<>();
        while(i>=0){
            while (!s.empty() && s.peek()<=arr[i%n]){
                s.pop();
            }
//            if(i < n){
//                array[i] = s.empty() ? -1 : s.peek();
//            }
            if(s.empty()){
                array[i%n] = -1;
            }
            else{
                array[i % n] = s.peek();
            }
            s.push(arr[i%n]);
            i--;
        }
        return array;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(findElement(new int[]{6,4,3,7,8,1,9,10})));

    }
}
