public class BitWiseManipulation_question {
    public static void main(String[] args) {
        System.out.println(noOfSetBits(9));
    }
    static boolean isOdd(int n){
        //last bit(lsb) decides weather number is even or odd . any bit $ 1 gives that digit so : if lsb is 1 = odd else true
        return (n&1) == 1;
    }
    static int findUnique(int [] arr){
        int unique=0;
        for(int i: arr){
            unique^=i;
        }
        return unique;
    }
    static int magic_number(int n){
        int ans=0;
        int base=5;
        while(n>0){

            int result=n&1;
            n=n>>1;
            ans+=base*result;
            base*=5;

        }
        return ans;
    }
     private static int noOfSetBits(int n){
//        System.out.println(Integer.toBinaryString(n));
        //set bit = bit whose value is 1
        //n & -n gives rightmost set bit of n,subtracting that from n will remove rightmost set bit after counting it.
        int count=0;
        while(n>0){
            count++;
            n-= n & -n;
        }
        //n & n-1 will remove right most set bit from the n. increment counter until n > 0 and remove set bits from right 1 by 1.
//        while(n>0){
//            count++;
//            n = n & n-1;
//        }
        return count;
    }

    static int ithBitInNumber(int n,int i){
        int mask=(1<<(i-1));
        return n& mask;
    }
    static boolean isPowerOf2(int n){
        if(n==0)return false;
        return (n & n-1)==0;
    }

    static int power(int base,int power){

        int ans=2;
        int b=base;
        while(power>0){
            if((power & 1)==1){
                ans*=b;
            }
            b*=b;
            power=power>>1;
        }
        return ans;
    }


}
