package SlidingWindow;

import java.util.ArrayList;
import java.util.Arrays;

public class MaxOfSubArr {
    private static void maxOfAllSubArr(int [] arr, int k){
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0;
        int j = 1;
        int n = arr.length;
        while(j < n){
            int max = arr[i];
            if(max < arr[j]){
                max = arr[j];
            }
            if((j - i + 1) < k){
                j++;
                continue;
            }
            if((j-i+1) == k){
                list.add(max);
                if(max == arr[i]){
                    max = arr[i+1];
                }
                i++;
                j++;
            }
        }
        System.out.println(Arrays.toString(list.toArray()));
    }

    public static void main(String[] args) {
        maxOfAllSubArr(new int[]{1,3,-1,-3,5,3,-6,7},3);
    }
}
