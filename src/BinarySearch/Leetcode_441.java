package BinarySearch;

public class Leetcode_441 {
    public static void main(String[] args) {
        System.out.println(NoOfStairs(8));
    }
//    In other words,you need to find the maximum value of k such that the sum of the first k natural numbers (1 + 2 +...+ k) is less than or equal to n.
//    The value of k represents the number of full rows of coins that can be formed in the staircase.
//    Calculate the sum of the first mid natural numbers using the formula,apply binary search accordingly
    static int NoOfStairs(int n){
        int left=1;
        int right=n;
        while(left<=right){
            int mid=left + (right-left)/2;
            int sum= (mid*(mid+1))/2;
            if(sum==n){
                return mid;
            }
            if(sum< n){
                left=mid+1;
            }
            else {
                right=mid-1;
            }
        }
        return (int)right;
    }
}
