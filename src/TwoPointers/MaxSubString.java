package TwoPointers;

import java.util.Arrays;
import java.util.Scanner;

//********* WITHOUT REPEATING CHARACTERS ********* //
public class MaxSubString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        hashing(str);
//        System.out.println("___________________");
//        TwoPointers("cabdzacdb");
    }
    private static void hashing(String str){

        int n = str.length();

        int maxLength =0 ;
        int len = 0;
        for(int i = 0; i<n;i++){
            int [] hashArr = new int[256];
            Arrays.fill(hashArr,0);
            for(int j = i;j<n;j++){
                if(hashArr[str.charAt(j)]==1)
                {
                    break;
                }
                len=j-i+1;
                maxLength= Math.max(len,maxLength);
                hashArr[str.charAt(j)]=1;
            }
        }
        System.out.println("Maximum length subString : " + maxLength);
    }
    private static void TwoPointers(String str){
        int len=0,r=0,maxLength=0;
        int [] hashArr = new int[256];
        int n = str.length();
        Arrays.fill(hashArr,0);
        while(r<n){
            if(hashArr[str.charAt(r)]!=1){
                if(hashArr[str.charAt(r)]>=len){
                    len = hashArr[str.charAt(r)]+1;
                }
                hashArr[str.charAt(r)]=1;
            }
            len=r-len+1;
            maxLength=Math.max(maxLength,len);
            hashArr[str.charAt(r)]=r;
            r++;
        }
        System.out.println(maxLength);
    }


}
