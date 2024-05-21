package BinarySearch;

import java.util.Arrays;

public class BinarySearch_167 {
    public static void main(String[] args) {
        int [] arr={2,7,11,15};
        System.out.println(Arrays.toString(twoSum(arr,9)));
    }
    static int[] twoSum(int [] arr, int target){

        for(int i=0;i<arr.length;++i){
            int start=i+1;
            int end= arr.length-1;
            while(start<=end){
                int mid=start + (end - start)/2;
                if(arr[i]+arr[mid]==target){
                    return new int[]{i+1,mid+1};
                }
                else if(arr[i]+arr[mid]>target){
                    end=mid-1;
                }
                else{
                    start = mid+1;
                }
            }
        }
        return new int[]{-1,-1};
    }
}
