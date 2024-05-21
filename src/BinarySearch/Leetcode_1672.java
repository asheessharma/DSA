package BinarySearch;

public class Leetcode_1672 {
    public static void main(String[] args) {
        int [][] accounts={
                {1,2,3},
                {2,4,5}
        };
        System.out.println(Richest(accounts));

    }

    static int Richest(int[][] accounts) {
        int ans = Integer.MIN_VALUE;
        for (int[] account : accounts) {
            int sum = 0;
            for (int item : account) {
                sum += item;
            }
            if (ans < sum) {
                ans = sum;
            }
        }
        return ans;
    }
}
