package SlidingWindow;

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
             if(j - i < k){
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
        bruteForceUsingLoops(new int[]{2,1,3,4,5,9,9} , 3);
        usingSlidingWindow(new int[]{2,1,3,4,5,9,9} , 3);
    }
}
