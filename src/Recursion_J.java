import java.util.*;
public class Recursion_J {
      public static void main(String[] args) {
          //System.out.println(fibonacci(4));
          System.out.println(fibonacci_formula(50));

    }
    static int fibonacci_formula(int n){
          return (int)(Math.pow(((1+ Math.sqrt(5))/2 ), n)/ Math.sqrt(5));
    }
    static int fibonacci(int n){
        if(n<2)
            return n;
        return fibonacci(n-1)+fibonacci(n-2);
    }

}
