package BinarySearch;

import java.util.Arrays;

public class Leetcode_34 {
    public static void main(String[] args) {
       int[] nums = {5,7,7,8,8,10};
       int target = 8 ;
     int [] ans ={-1,-1};
     ans[0]=Position(nums , target, true);
     if(ans[0]!=-1){
         ans[1]=Position(nums, target, false);
     }
        System.out.println(Arrays.toString(ans));
    }
    static int Position(int [] nums , int target , boolean isStartIndex){
        int ans=-1;
        int start = 0;
        int end = nums.length-1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target < nums[mid]){
                end = mid - 1;
            }
            else if(target > nums[mid]){
                start = mid + 1;
            }
            else{
                ans = mid;
                if(isStartIndex){
                    end =  mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
        }
        return  ans;
    }

}
