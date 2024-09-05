package SlidingWindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class FirstNegNumInSubArr {
    private static void findFirstNegNumb(int [] arr, int k){
        Deque<Integer> dq = new LinkedList<Integer>();
        ArrayList<Integer> result = new ArrayList<>();
        int n = arr.length;
        for(int i = 0 ; i < n; i++){
            if(arr[i]<0){
                dq.add(i);
            }
            if(i <= k-1){
                if(!dq.isEmpty()){
                    result.add(arr[dq.peekFirst()]);
                }
                else{
                    result.add(0);
                }
            }
            if(!dq.isEmpty() && dq.peekFirst() <= i-k){
                dq.pollFirst();
            }
        }
        System.out.println(Arrays.toString(result.toArray()));
    }

    public static void main(String[] args) {
        findFirstNegNumb(new int[]{12,-1,-7,8 ,-15,30,16,28} ,3);
    }
}
