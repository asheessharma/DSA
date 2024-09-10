package SlidingWindow;

public class VariableSizeSlidingWindow {
    // Max length subArr with sum K
    private static void maxLenSubArr(int [] arr , int k){
        int i = 0;
        int j = 0;
        int sum = 0;
        int n = arr.length;
        int len = 0;
        while(j < n){
            sum+=arr[j];
            while(sum > k){
                sum-=arr[i];
                i++;
            }
            if(sum == k){
                len = Math.max(len,(j-i+1));
            }
            j++;
        }
        System.out.println(len);
    }

    public static void main(String[] args) {
        maxLenSubArr(new int[]{4,1,1,1,2,3,5} , 5);
    }

}
