package SortingAlgoes;

import java.util.Arrays;
//it works better with linkedList due to random memory allocation.
public class MergeSort {
    public static void main(String[] args) {
        int [] arr={2,1,4,5,3};
        MergesortInPlace(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] mergesort(int [] arr){
        if(arr.length==1)
            return arr;
        int mid=arr.length/2;
        int [] left= mergesort(Arrays.copyOfRange(arr,0,mid));
        int [] right= mergesort(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(left,right);
    }

    private static int[] merge(int[] first, int[] second) {
        int [] sorted= new int[first.length+second.length];
        int i=0,j=0,k=0;
        while(i<first.length && j<second.length){
            if(first[i]<second[j]){
                sorted[k]=first[i];
                i++;
            }
            else{
                sorted[k]=second[j];
                j++;
            }
            k++;
        }
        while(i< first.length){
            sorted[k]= first[i];
            i++;
            k++;
        }
        while(j< second.length){
            sorted[k]= second[j];
            j++;
            k++;
        }
        return sorted;
    }
    static void MergesortInPlace(int [] arr,int s,int e){
        if(e-s==1)
            return;
        int mid= s + (e - s)/2;
        MergesortInPlace(arr,s,mid);
        MergesortInPlace(arr,mid,e);
        MergeInPlace( arr , s, mid, e);
    }
    static void MergeInPlace(int [] arr, int s, int m, int e){

        int [] mix= new int[e-s];
        int i=s;
        int j=m;
        int k=0;
        while(i<m && j<e){
            if(arr[i]<arr[j]){
                mix[k]=arr[i];
                i++;
            }
            else{
                mix[k]=arr[j];
                j++;
            }
            k++;
        }
        while(i<m){
            mix[k]=arr[i];
            i++;
            k++;
        }
        while(j<e){
            mix[k]=arr[j];
            j++;
            k++;
        }
        for (int l = 0; l < mix.length; l++) {
            arr[s+l]=mix[l];
        }
    }

}
