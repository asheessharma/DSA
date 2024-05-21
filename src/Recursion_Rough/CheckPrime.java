package Recursion_Rough;

public class CheckPrime {
    public static void main(String[] args) {
        System.out.println(isPrime(19,2));
    }
    private static boolean isPrime(int n ,int i){
        if(n<=2){
            return n<=2? true:false;
        }
        if(i*i>n){
            return true;
        }
        if(n%i==0){
            return false;
        }
        return isPrime(n,i+1);
    }
}
