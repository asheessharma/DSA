package TCSDigital2024;


import java.util.Arrays;
import java.util.Scanner;

public class RightRotateArray {
    private static void rotate(int [] arr, int start, int end){
        int i = start;
        int j = end;
        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    private static int[] logic(int [] arr, int k){
        rotate(arr,0,arr.length-1);
        rotate(arr,0, k-1);
        rotate(arr,k,arr.length-1);
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr  = {1,4,5,6,7,8,9};
        System.out.print("Input the value of K : ");
        int k = sc.nextInt();
        System.out.println(Arrays.toString(logic(arr,k)));
    }
}
