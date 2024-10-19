import java.util.Arrays;

public class Shadowing {
    static int x=90; //this class variable, will be shadowed at line 7

    public static void main(String[] args) {
//        System.out.println(x);
//        int x =99;// higher level is shadowed by lower level variable
//        System.out.println(x);
//        fun();
        //function overloading
//        varargs(1,2,3,4,5,6,7,89);
//        varargs("ashish", "sharma", "prashant" , "radha");
        System.out.println(isPrime(99));

    }
    static void fun(){
        System.out.println(x);
    }
    //when you don't know how many arguments will you pass(variable arguments of same type)
    // this will accept an array of integers.

    static void varargs(int ...v){
        System.out.println(Arrays.toString(v));
    }
    //function overloading (at compile time this decides which function to run by checking type of arguments and by order of passing them
    static void varargs(String ...v){
        System.out.println(Arrays.toString(v));
    }

    static boolean isPrime(int var){
        if( var <=1){
            return false;
        }
        int c=2;
        while(c*c <= var){
            if(var % c ==0){
                return false;
            }
            c++;
        }
        return c*c > var;
    }




}
