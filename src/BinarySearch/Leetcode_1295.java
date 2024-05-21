package BinarySearch;

import java.util.Scanner;

public class Leetcode_1295 {
    public static void main(String[] args) {
       // Scanner sc=new Scanner(System.in);
        int [] nums={12,345,26,7896};
        System.out.println(findNumbers(nums));
    }
    public static int findNumbers(int [] nums){
        int count=0;
        if(nums.length==0){
            return  0;
        }
        for (int i = 0; i < nums.length; i++) {
            if(iseven(nums[i])){
                count ++;
            }
        }
        return  count;
    }
//    static boolean isEven(int n){
//        if(n<0){
//            n = n * -1;
//        }
//        String str= n+" ";
//        return str.length() % 2 == 0;
//    }
    static boolean iseven(int num){
        if(num<0){
            num*=-1;
        }
        int n =(int)Math.log10(num) + 1;
        return n % 2 ==0;
    }


}
