package Stack_Queue;

import java.util.Scanner;
import java.util.Stack;

public class checkBrackets {
    private static boolean checkParenthesis(String str){
        Stack <Character>s = new Stack<>();
        char [] ch = str.toCharArray();
        for(char c : ch){
            if(c == '(' || c == '{' || c == '['){
                s.push(c);
            }
            else{
                if(s.empty()) return false;
                char temp = s.pop();

                if((c == ')' && temp == '(') ||( c == ']' && temp == '[' )|| (c == '}' && temp == '{')){
                    continue;
                }
                else{
                    return false;
                }

            }
        }
        return s.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = sc.nextLine();
        System.out.println(checkParenthesis(str));
    }
}
