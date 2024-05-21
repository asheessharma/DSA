package BinarySearch;

public class Leetcode_33 {
    public static void main(String[] args) {
        int [] nums = {3,1};
        int target = 1;
        System.out.println(findIndex(nums, target));

    }
    static int findIndex(int [] nums , int target ){
        int pivot= pivotEle(nums);
        if(pivot == -1){
            return  binarySearch(nums , target , 0, nums.length-1);
        }
        if(target == nums[pivot])
            return pivot;
        if(target >= nums[0])
            return binarySearch(nums, target,0, pivot-1);
        return binarySearch(nums, target, pivot+1, nums.length-1);
    }
    static int pivotEle(int [] arr){
        int start=0;
        int end = arr.length - 1;
        while(start < end){
            int mid = start + (end - start) / 2;
            if(mid < end && arr[mid] > arr[mid+1])
                return mid;
            if(mid > start && arr[mid] < arr[mid -1])
                return mid-1;
            if(arr[mid] <= arr[start]){
                end = mid -1 ;
            }
            else {
                 start = mid + 1;
            }
        }
        return -1;
    }
    static int binarySearch(int [] arr, int target , int start , int end){
        while(start <= end){
            int mid= start + (end - start) / 2;
            if(target > arr[mid]){
                start= mid+1;
            }
            else if(target < arr[mid]){
                end= mid-1;
            }
            else{
                return  mid;
            }
        }
        return -1;
    }
}
