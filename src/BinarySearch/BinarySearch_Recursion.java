package BinarySearch;

public class BinarySearch_Recursion {
    public static void main(String[] args) {
        int [] arr= {2,3,5,9,14,16,17,18};
        int target= 90;
        System.out.println(Binary(arr,target,0,arr.length-1));
    }
    static int Binary(int [] arr, int target,int start,int end){
        if(start>end){
            return -1;
        }
        int mid =start + (end - start)/2;
        if(arr[mid]==target)
            return mid;
        if(arr[mid]<target)
            return Binary(arr,target,mid+1,end);
        return Binary(arr,target,start,mid-1);
    }
}
