package SortingAlgoes;

import java.util.*;
public class Selection_Sort {
    public static void main(String[] args) {
        int [] arr={4,5,3,-8,-1};
        selection(arr);
//        selectionRecursion(arr,arr.length,0,0);
        System.out.println(Arrays.toString(arr));
    }
    //find maximum element in array and swap to its correct position that is last position.
    static void selection(int []arr){
        for(int i=0;i < arr.length;i++){
            int last = arr.length - i - 1;
            int max= FindMax(arr,0,last);
            swap(arr,max,last);
        }
    }
    static int FindMax(int [] arr, int start, int end){
        int max=start;
        for(int i= start;i<=end;i++){
            if(arr[i]>arr[max]){
                max = i;
            }
        }
        return  max;
    }
    static void swap(int [] arr, int first, int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }

    static void selectionRecursion(int [] arr,int r, int c, int max){
        if(r==0) return;
        if(c<r){
            if(arr[c]>arr[max]){
                selectionRecursion(arr,r,c+1,c);
            }
            else{
                selectionRecursion(arr,r,c+1,max);
            }
        }
        else{
            int temp=arr[max];
            arr[max]=arr[r-1];
            arr[r-1]=temp;
            selectionRecursion(arr,r-1,0,0);
        }
    }

}
