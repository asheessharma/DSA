import java.util.Scanner;

public class swapTwoNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Before Swapping : a = " + a +" b = "+b);
        swapWithoutUsingThird(a,b);
    }
    public static void swapWithoutUsingThird(int a,int b){
         a = a+b;//18 , 8
         b=a-b;
         a=a-b;
        System.out.println("After swapping: a= "+a+" b= "+b);
    }
}
