package Stack_Queue;

import java.util.Scanner;
import java.util.Stack;

public class PrefixToPostfix {
    private static String convertToPostfix(String str){
        int i = str.length() - 1;
        Stack<String> s = new Stack<>();
        while(i>=0){
            char ch = str.charAt(i);
            if((ch>='a' && ch<='z')||(ch>='A' && ch <= 'Z') ||(ch>='1' && ch<='9')){
                s.push(ch+ "");
            }
            else if(!s.empty() && ch!='(' && ch!=')'){
                String t1 = s.pop();
                String t2 = s.pop();
                String con =  t1 + t2 + ch;
                s.push(con);
            }
            else{
                return "<> Fuck You Moron <>";
            }
            i--;
        }
        return s.pop();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the prefix expression: ");
        String input = sc.nextLine();
        System.out.println(convertToPostfix(input));
    }

}
