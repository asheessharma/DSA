package SortingAlgoes;

import java.util.Arrays;

// take each element, compare it with other place and place it in its right position
public class Bubble_recursion {
    public static void main(String[] args) {
        int [] arr= {4,3,2,1,9};
        Bubble_recursion.sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    private static void sort(int [] arr, int index, int length){
        if(length==0){
            return ;
        }
        if(index<length){
            if(arr[index] > arr[index+1]){
                int temp= arr[index];
                arr[index]=arr[index+1];
                arr[index+1]=temp;
            }
             sort(arr,index+1,length);
        }else{
             sort(arr,0,length-1);
        }
    }


}
