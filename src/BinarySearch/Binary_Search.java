package BinarySearch;
import java.util.Scanner;
public class Binary_Search {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N= sc.nextInt();
        int [] nums=new int[N];
        for (int i = 0; i < N; i++) {
            nums[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        System.out.println(BS(nums,k));
    }
    static int BS(int [] nums, int target){
        int start=0;
        int end= nums.length-1;
         while(start <= end){
             int mid= start + (end - start)/2;
             if(target > nums[mid]){
                 start= mid+1;
               }
             else if(target < nums[mid]){
                 end= mid-1;
             }
             else{
                 return  mid;
             }
         }
         return -1;
    }
    static int orderAgnosticBS(int [] nums , int target){
        int start=0;
        int end= nums.length-1;
        boolean isAscending = nums[start] < nums[end];

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


}
