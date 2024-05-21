package SortingAlgoes;

import java.util.Arrays;
//inplace sort algorithm & it's not stable
//worst case time complexity is O(n^2)==> example {2,4,3,5,66,70,18,<pivot>88}
// best case time complexity is O(nlogn) [pivot element is middle element]
public class QuickSort {
    public static void main(String[] args) {
        int [] arr={5,4,3,2,1};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void quickSort(int [] arr,int low,int high){
        if(low>=high) return;
        int s=low;
        int e=high;
        int mid= s + (e - s)/2;
        int pivot=arr[mid];
        while(s<=e){
            while(arr[s]<pivot){
                s++;
            }
            while(arr[e]>pivot){
                e--;
            }
            if(s<=e){
                int temp=arr[s];
                arr[s]=arr[e];
                arr[e]=temp;
                s++;
                e--;
            }
        }
        quickSort(arr,low,e);
        quickSort(arr,s,high);
    }


}
