package SortingAlgoes;

import java.util.Arrays;

public class Sort_Bubble {
    public static void main(String[] args) {
        int [] arr={1,0,-1,-1,90,99,23};
        sort(arr);
//        bubbleRecursion(arr,arr.length-1,0);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int [] arr){
        for(int i=0;i< arr.length;i++){
            boolean swapped=false;
            for(int j=1;j< arr.length-i;j++){
                if(arr[j]< arr[j-1]){
                    int temp = arr[j];
                    arr[j]= arr[j-1];
                    arr[j-1]=temp;
                    swapped=true;
                }
            }
            if(!swapped){ //if its already sorted then it breaks the loop and stops unnecessary executions
                break;
            }
        }
    }

    static void bubbleRecursion(int [] arr, int r,int c){
        if(r==0) return;
        if(c<r){
            if(arr[c]>arr[c+1]){
                int temp=arr[c];
                arr[c]=arr[c+1];
                arr[c+1]=temp;
            }
            bubbleRecursion(arr,r,c+1);
        }
        else{
            bubbleRecursion(arr,r-1,0);
        }
    }

}
