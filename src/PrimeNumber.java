public class PrimeNumber {
    public static void main(String[] args) {
//        optimisedPrimeNo(45);
        primeNumberInRange(50);
    }
//array is created of given range ,  number is checked then all of its multiples are  marked true.
    static void optimisedPrimeNo(int n){
        boolean [] prime=new boolean[n+1];
        for(int i=2;i*i<=n;i++){
            if(!prime[i]){
                for(int j=i*2;j<=n;j+=i){
                    prime[j]=true;
                }
            }
        }
        for(int i=2;i<=n;i++){
            if(!prime[i]){
                System.out.println(i +" "+"is prime");
            }
        }
    }

    static void primeNumberInRange(int n){
        for(int i=0;i<=n;i++){
            if(isPrime(i)){
                System.out.println(i + " " +"is Prime");
            }
        }
    }
    static boolean isPrime(int n){
        if(n<=1)
            return false;
        int c=2;
        while(c*c<=n){
            if(n%c==0)
                return false;
            c++;
        }
        return  true;
    }
}
