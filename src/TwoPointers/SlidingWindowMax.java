package TwoPointers;

import java.util.ArrayList;

public class SlidingWindowMax {
    private static ArrayList<Integer> MaxWindow(int [] numbs , int k){
        ArrayList<Integer> arr = new ArrayList<>();
        int n = numbs.length;
        for(int i = 0; i <= n - k ; i++){
            int max = numbs[i];
            for(int j = i ; j <= i + k - 1 ; j++){
                max = Math.max(numbs[j] ,max);
            }
            arr.add(max);
        }

        return arr;
    }

    public static void main(String[] args) {
        System.out.println(MaxWindow(new int[]{1,3,-1,-3,5,3,6,7},3));
    }

}
