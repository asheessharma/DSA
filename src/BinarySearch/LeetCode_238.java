package BinarySearch;

import java.lang.reflect.Array;
import java.util.Arrays;

/* Product except self : space complexity O(1) approach is update same array first with left array product then update same array with array
* product from right side */
public class LeetCode_238 {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        System.out.println(Arrays.toString(Product(arr)));
    }
    static int[] Product(int [] arr){
        int [] result=new int[arr.length];
        int runningLeft=1;
        for(int i=0;i<arr.length;i++){
            result[i]=runningLeft;
            runningLeft*=arr[i];
        }
        int runningRight=1;
        for(int j=arr.length-1;j>=0;j--){
            result[j]*=runningRight;
            runningRight*=arr[j];
        }
        return result;
    }



}


