package SlidingWindow;


import java.util.Scanner;

public class MaxSumSubArr {
    private static void bruteForceUsingLoops(int [] arr , int k){
        int n = arr.length;
        int max = 0;
        for(int i = 0; i < n-k; i++){
            int sum = 0;
            for(int j = i; j < i + k ; j++){
                sum+=arr[j];
            }
            max = Math.max(max,sum);
        }
        System.out.println("Maximum Sum SubArray( Using Brute Force ): " + max);
    }
    private static void usingSlidingWindow(int [] arr, int k){
        int i = 0;
        int j = 0;
        int n = arr.length;
        int sum = 0;
        int max = 0;
        while(j<n){
             if((j - i + 1) <= k){
                 sum += arr[j];
             }
             else{
                 max = Math.max(max , sum);
                 sum += arr[j] - arr[i];
                 i++;
             }
            j++;
        }
        System.out.println("Maximum Sum SubArray( Optimised ) : "+ max);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of arr : ");
        int input = sc.nextInt();
        int [] numbs = new int[input];
        for(int i = 0; i < input ; i++){
            System.out.print("Enter " + (i+1) +" st element : ");
            numbs[i] = sc.nextInt();
        }
        System.out.print("Enter length of SubArray [Window] : ");
        int k  = sc.nextInt();
        bruteForceUsingLoops(numbs, k);
        usingSlidingWindow(numbs,k);
    }
}
