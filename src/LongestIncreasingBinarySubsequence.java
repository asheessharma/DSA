import java.util.Scanner;
import java.util.*;
public class LongestIncreasingBinarySubsequence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        solve(n);
    }
    private static void solve(int n){
        int [] arr=new int[8];
        Arrays.fill(arr,0);
        if(n<=2){
            System.out.println(n);
        }else {
            for (int i = 1; i <= n; i++) {
                int temp = i;
                int counter = 0;
                while (temp > 0) {
                    counter++;
                    temp -= (temp & -temp);
                }
                arr[counter - 1]++;
            }

            int max = arr[0];
            for (int i : arr) {
                if (i > max) {
                    max = i;
                }
            }

            System.out.println(max);
        }
    }

}
