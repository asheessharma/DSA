package cyclicSort_Questions;

import java.util.Arrays;

public class CyclicSort_645 {
    public static void main(String[] args) {
        int [] n={1,2,2,4};
        System.out.println(Arrays.toString(findErrorNums(n)));
    }
    public static int[] findErrorNums(int[] nums) {
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
            if(nums[j]!= j+1){
                return new int[]{nums[j],j+1};
            }
        }
        return new int[]{nums.length,nums.length};
    }
    public static  void swap(int [] arr, int first , int second){
        int temp= arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
