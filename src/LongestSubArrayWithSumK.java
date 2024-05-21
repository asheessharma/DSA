import java.util.*;
public class LongestSubArrayWithSumK {
    public static void main(String[] args) {
            int [] arr={10, 5, 2, 7, 1, 9};
            int k=15;
            int n=arr.length;
        System.out.println(forPostivesOnly(arr,n,k));
        System.out.println(lenOfLongSubarr(arr,n,k));
    }
    public static int forPostivesOnly(int [] a ,int n,int k){
        int i=0;
        int j=0;
        int len=0;
        int sum=a[0];
        while(j<n){
            while(i<=j && sum>k){
                sum-=a[i];
                i++;
            }
            if(sum==k){
                len=Math.max(len,j-i+1);
            }
            j++;
            if(sum<k) {
                sum += a[j];
            }
        }
        return len;
    }
    public static int lenOfLongSubarr (int a[], int N, int K) {
        int len=0;
        int sum=0;
        Map<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<N;i++){
            sum+=a[i];

            if(sum==K){
                len=i+1;
            }
            if(map.containsKey(sum-K)){
                len=Math.max(len, i - map.get(sum-K));
            }
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
        }
        return len;

    }
}
