package SlidingWindow;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class FirstNegNumInSubArr {
    private static void findFirstNegNumb(int [] arr, int k){
        int j = 0;
        int n = arr.length;
        int i = 0;
        Deque<Integer> dq = new LinkedList<>();
        ArrayList<Integer> list  = new ArrayList<>();
        while(j < n){
            if(arr[j]<0){
                dq.add(arr[j]);
            }
            if((j - i + 1) < k){
                j++;
            }
            else if((j - i + 1) == k){
                if(!dq.isEmpty()){
                    list.add(dq.peekFirst());
                }
                else{
                    list.add(0);
                }

                if(!dq.isEmpty() && dq.peekFirst()== arr[j-k + 1]){
                    dq.pollFirst();
                }
                i++;
                j++;
            }
        }
        System.out.println(Arrays.toString(list.toArray()));
    }
    private static void bruteForce(int [] arr, int k){
        int i = 0;
        int j = 0;
        int n = arr.length;
        while(j < n){
            if(j - i + 1 < k){
                j++;
            } else if((j - i + 1) == k){
                boolean flag = false;
                for(int l = i ; l <= j ; l++){
                    if(arr[l] < 0){
                        flag = true;
                        System.out.print(arr[l] +" ");
                        break;
                    }
                }
                if(!flag){
                    System.out.print(0 + " ");
                }
                i++;
                j++;
            }
        }
        System.out.println();

    }

    public static void main(String[] args) {
        System.out.print("Brute Force : ");
        bruteForce(new int[]{12,-1,-7,8 ,-15,30,16,-28} ,3);
        System.out.println("***********************************");
        System.out.print("Optimized : ");
        findFirstNegNumb(new int[]{12,-1,-7,8 ,-15,30,16,-28} ,3);
    }
}
