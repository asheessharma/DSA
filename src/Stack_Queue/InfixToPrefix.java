package Stack_Queue;
import java.util.Scanner;
import java.util.Stack;
public class InfixToPrefix {
    private static int priority(char ch){
        switch (ch){
            case '+' , '-':
                return 1;
            case '*' , '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }
    private static String reverse(String str){
        char [] arr = str.toCharArray();
        String str1 = "";
        for(int i = arr.length - 1; i >= 0 ; i--){
            if(arr[i]=='('){
                str1 += ')';
            }else if(arr[i] == ')'){
                str1 += '(';
            }
            else{
                str1 += arr[i];
            }
        }
        return str1;
    }
    private static String prefix(String str){
        String str1 = reverse(str);
        char [] chars = str.toCharArray();
        int i = 0;
        Stack<Character> stk = new Stack<>();
        String ans = "";
        while(i < str1.length()){
            if((chars[i]>='a' && chars[i]<='z')||(chars[i]>='A' && chars[i]<='Z')||(chars[i]>='1' && chars[i]<='9')){
                ans+=chars[i];
            }
            else if(chars[i]=='('){
                stk.push(chars[i]);
            }
            else if(chars[i]==')'){
                while(!stk.empty() && stk.peek()!='('){
                    ans+=stk.pop();
                }
                stk.pop();
            }
            else{
                while(!stk.empty() && priority(chars[i])<= priority(stk.peek())){
                    ans+=stk.pop();
                }
                stk.push(chars[i]);
            }
            i++;
        }
        while(!stk.empty()){
            if(stk.peek()=='('){
                return "**** Invalid Expression ****";
            }
            ans += stk.pop();
        }
        return reverse(ans);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Infix Expression here: ");
        String str = sc.nextLine();
        System.out.println(prefix(str));

    }





}
