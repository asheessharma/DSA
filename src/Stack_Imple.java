import java.util.Scanner;

public class Stack_Imple {
    int top = -1;
    int [] arr;
    static int size;
    public Stack_Imple(int size){
        arr = new int[size];
    }
    public void push(int n){
        if(top > size){
            System.out.println("****** Warning! Stack is full *******");
        }
        top = top+1;
        arr[top]=n;
    }
    public void top(){
        if(top == -1){
            System.out.println("***** Stack is Empty *****");
        }else{
            System.out.println(arr[top]);
        }
    }

    public void pop(){
        if(top == -1){
            System.out.println("***** Stack is Empty *****");
        }
        else{
            int ele = arr[top];
            top = top - 1;
            System.out.println(ele );
        }


    }
    public int size(){
        return top+1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your size: ");
         size = sc.nextInt();
         Stack_Imple stack  = new Stack_Imple(size);
         stack.push(10);
         stack.push(20);
         stack.push(30);
         stack.push(40);
         stack.push(50);
            stack.top();
            stack.pop();
            stack.top();
            stack.pop();
    }
}
