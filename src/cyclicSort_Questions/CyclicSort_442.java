package cyclicSort_Questions;

import java.util.*;
public class CyclicSort_442 {
    public static void main(String[] args) {
        int [] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDuplicates(nums));
    }
     static List<Integer> findDuplicates(int[] nums) {
        List<Integer> res=new ArrayList<>();
        int i=0;
        while(i < nums.length){
            int index = nums[i] - 1;
            if(nums[index]!=nums[i]){
                swap(nums, index,i);
            }
            else{
                i++;
            }
        }
        for(int ix=0;ix<nums.length;ix++){
            if(nums[ix]!= ix+1){
                res.add(nums[ix]);
            }
        }
        return res;

    }
    static void swap(int [] nums, int first, int second){
        int temp=nums[first];
        nums[first]=nums[second];
        nums[second]=temp;
    }
}
