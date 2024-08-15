package Garbaje_Section;

public class BinaryTODecimal {
    private static int binaryToDecimal(String str){
        int ans = 1;
        int result = 0;
        int n = str.length();
        for(int i = 1; i <= n ;i++){
            if(str.charAt(n - i) == '1'){
                result+=ans;
            }
            ans = ans * 2;
        }
        return result;
    }
    private static void alt(String str){
        int result = 0;
        for(int i = 0; i < str.length() ;i++){
            if(str.charAt(str.length() - i - 1) == '1'){
                result += Math.pow(2,i);
            }
        }
        System.out.println("Decimal conversion is : " + result);
    }


    public static void main(String[] args) {
        System.out.println(binaryToDecimal("100100111"));
        alt("100100111");
    }
}
