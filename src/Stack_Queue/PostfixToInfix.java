package Stack_Queue;

import java.util.Scanner;
import java.util.Stack;

public class PostfixToInfix {
    private static String infixExp(String str){
        int i = 0;
        int n = str.length();
        Stack<String> stk = new Stack<>();
        while(i<n){
            char ch = str.charAt(i);
            if((ch>='a' && ch<='z')||(ch>='A' && ch <= 'Z') ||(ch>='1' && ch<='9')){
                stk.push(ch+ "");
            }
            else if(!stk.empty() && ch!='(' && ch!=')'){
                    String t1 = stk.pop();
                    String t2 = stk.pop();
                    String con = "( " + t2 + ch + t1 + " )";
                    stk.push(con);
            }
            else{
                return "**** Illegal String ****";
            }
            i++;
        }
        return stk.pop();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the postfix expression: ");
        String input = sc.nextLine();
        System.out.println(infixExp(input));
    }
}
