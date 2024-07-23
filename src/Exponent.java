import java.util.*;
public class Exponent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base : ");
        int base = sc.nextInt();
        System.out.print("Enter the power : ");
        int power = sc.nextInt();
        findPower(base,power);
    }
    private static void findPower(int b , int p){
        int mul = 1;
        while(p > 1){
            if(p%2 == 1){
                mul*=b;
                p=p-1;
            }
            else{
                mul = mul*b*b;
                p/=2;
            }
        }
        System.out.println(mul);
    }

}
