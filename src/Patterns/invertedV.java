package Patterns;

import java.util.Scanner;

public class invertedV {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of Rows: ");
        int n=sc.nextInt();
//        printInvertedV(n);
        printV(n);
    }
    public static void printInvertedV(int n){
        for(int i=0;i<n;i++){
            for(int j=n;j>i;j--){
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++){
                if(k==0 || k==i){
                    System.out.print(" * ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
    public static void printV(int n){
        for(int i=0;i<n;i++){
            for(int j=n;j>i;j--){
                System.out.print(" ");
            }
            for(int k=0;k<n;k++){
                if(k==0 || k==i){
                    System.out.print(" * ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

}
