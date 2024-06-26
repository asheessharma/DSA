package cyclicSort_Questions;

import java.util.*;

public class CyclicSort_448 {
    public static void main(String[] args) {
        int []nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(nums));
    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list= new ArrayList<>();
        int i=0;
        while(i < nums.length){
            int index= nums[i]-1;
            if(nums[index]!=nums[i]){
                swap(nums,index,i);
            }
            else{
                i++;
            }
        }
        for(int j=0;j< nums.length;j++){
            if(nums[j]!=j+1){
                list.add(j+1);
            }
        }
        return list;
    }
    public static  void swap(int [] nums,int first, int second){
        int temp = nums[first];
        nums[first]= nums[second];
        nums[second]=temp;
    }
}
