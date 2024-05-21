package SortingAlgoes;

import java.util.Arrays;

public class Selection_recursion {
    public static void main(String[] args) {
        int [] arr= {2,5,1,4,3,6};
        Selection_recursion.select(arr,0,arr.length-1,0);
        System.out.println(Arrays.toString(arr));
    }
    private static void select(int [] arr,int index,int length,int max){
        if(length==0){
            return;
        }
        if(index<length){
            if(arr[index]>arr[max]){
                select(arr,index+1,length,index);
            }
            else{
                select(arr,index+1,length,max);
            }
        }else{
            int temp=arr[length-1];
            arr[length -1]=arr[max];
            arr[max]=temp;
            select(arr,0,length-1,0);
        }
    }

}
