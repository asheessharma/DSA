package Patterns;

import java.util.Scanner;

public class xstar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n=sc.nextInt();
        if((n&1)==1){
            printPattern(n);
        }else{
            System.out.println("Not Possible");
        }

    }
    public static void printPattern(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j || i+j == n-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
