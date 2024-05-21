package cyclicSort_Questions;

import java.util.Arrays;
// when numbers are given in range 1 to n;
public class Cycle_Sort {
    public static void main(String[] args) {
        int [] arr={3,5,2,1,4};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void cyclicSort(int[] arr){
        int i=0;
        while(i < arr.length){
            int index=arr[i]-1;
            if(arr[i]!=arr[index]) {
                swap(arr, i, index);
            }else {
                i++;
            }
        }
    }

    private static void swap(int[] arr, int i, int index) {
        int temp=arr[i];
        arr[i]=arr[index];
        arr[index]=temp;
    }
}
