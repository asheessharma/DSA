package Stack_Queue;

import java.util.Scanner;
import java.util.Stack;

public class InfixToPostfix {
    static int priority(char ch){
        return switch (ch) {
            case '+', '-' -> 1;
            case '*', '/' -> 2;
            case '^' -> 3;
            default -> -1;
        };
    }

    private static void infix2postfix(String str){
        int n = str.length();
        char [] arr = str.toCharArray();
        Stack<Character> s = new Stack<>();
        int i = 0;
        String ans = "";
        while(i < n){
            if((arr[i] >= 'a' && arr[i]<='z')||(arr[i] >= 'A' && arr[i]<='Z') ||(arr[i] >= '1' && arr[i]<='9')){
                ans+=arr[i];
            }
            else if(arr[i]=='('){
                s.push(arr[i]);
            }
            else if(arr[i] == ')'){
                while(!s.empty() && s.peek()!='('){
                    ans += s.pop();
                }
                s.pop();
            }
            else{
                while(!s.empty() && priority(arr[i])<= priority(s.peek())){
                        ans += s.pop();
                }
                s.push(arr[i]);
            }
            i++;
        }
        while(!s.empty()){
            if(s.peek()=='('){
                System.out.println("Invalid Expression");
                return;
            }
            ans+=s.pop();
        }
        System.out.println("Resulting Postfix expression: "+ ans);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        infix2postfix(str);

    }
}
