public class TCS {
    public static boolean isPrime(int n){
        if(n<=1) return false;
        int c=2;
        while(c*c<=n){
            if(n%c==0) return false;
            c++;
        }
        return true;
    }
    public static int findSum(int n){
        if(n<10) return n;
        int sum=0;
        while(n!=0){
            int rem=n%10;
            sum+=rem;
            n/=10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int n=1;
        int m=10;
        for(int i=n;i<=m;i++){
            if(isPrime(i)){
                if(isPrime(findSum(i))){
                    System.out.println(i);
                }
            }
        }
    }
}
