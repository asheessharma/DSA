package Stack_Queue;

import java.util.Scanner;
import java.util.Stack;

public class PostfixToPrefix {
    private static String convertPostfix(String str){
        int i = 0;
        int n = str.length();
        Stack<String> s = new Stack<>();
        while(i<n){
            char ch = str.charAt(i);
            if((ch>='a' && ch<='z')||(ch>='A' && ch <= 'Z') ||(ch>='1' && ch<='9')){
                s.push(ch + "");
            }
            else if(!s.empty() && ch!='(' && ch!=')'){
                String t1 = s.pop();
                String t2 = s.pop();
                String con = ch + t1 + t2 ;
                s.push(con);
            }
            else{
                return "** Check your input string again **";
            }
            i++;
        }
        return s.pop();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the postfix expression : ");
        String input = sc.nextLine();
        System.out.println("Infix Expression: "+convertPostfix(input));
    }


}
