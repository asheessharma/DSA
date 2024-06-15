package BinarySearch;
public class Leetcode_1095 {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,3,1};
        System.out.println(search(arr,5));
    }
     static int search(int [] arr, int target){
       int peak= peakIndexInMountainArray(arr);
       int index=orderAgnosticBS(arr,target,0, peak);
       if(index == -1){
           index = orderAgnosticBS(arr, target, peak+1, arr.length-1);
       }
       return index;
    }
    static int orderAgnosticBS(int [] nums, int target, int start, int end){
        boolean isAscending= nums[start] < nums[end];
        while(start <= end){
            int mid= start + (end - start)/2;
            if(target ==  nums[mid]){
                return mid;
            }
            if(isAscending){
                if(target < nums[mid])
                    end = mid - 1;
                else if(target > nums[mid])
                    start = mid +1;
            }
            else{
                if(target < nums[mid])
                    start = mid + 1;
                else if(target > nums[mid])
                    end = mid - 1;
            }
        }
        return -1 ;
    }

    public static int peakIndexInMountainArray(int[] arr) {
        int start= 0;
        int end = arr.length-1;
        while(start <  end){
            int mid= start + (end -  start) / 2;
            if(arr[mid] > arr[mid+1]){
                end=mid;
            }
            else if(arr[mid] < arr[mid +1]){
                start = mid +1;
            }

        }
        return start ;
    }
}
