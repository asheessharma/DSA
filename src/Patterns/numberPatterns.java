package Patterns;

import java.util.Scanner;

public class numberPatterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
//        triangle1(n);
//        System.out.println();
//        triangle2(n);
//        System.out.println();
        columnWise(n);
    }
    private static void triangle1(int n){
        int count=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(count++ + " ");
            }
            System.out.println();
        }
    }
    private static void triangle2(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            for(int k=i-1;k>=1;k--){
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
    private static void columnWise(int n){

        for(int i=1;i<=n;i++){
            int temp=i;
            for(int j=1;j<=i;j++){
                System.out.print(temp +" ");
                temp=temp+n-j;
            }
            System.out.println();
        }
    }
}
