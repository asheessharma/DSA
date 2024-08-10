package Stack_Queue;

import java.util.Scanner;
import java.util.Stack;

public class PrefixToInfix {
    private static String convertPrefix(String str){
        Stack<String> stk = new Stack<>();
        int n = str.length();
        int i = n-1;
        while(i>=0){
            char ch = str.charAt(i);
            if((ch>='a' && ch<='z')||(ch>='A' && ch <= 'Z') ||(ch>='1' && ch<='9')){
                stk.push(ch+ "");
            }
            else{
                String t1 = stk.pop();
                String t2 = stk.pop();
                String ans = "( "+ t1 + ch + t2 + " )";
                stk.push(ans);
         }
            i--;
        }
        return stk.pop();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(convertPrefix(str));
    }

}
