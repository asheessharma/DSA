package Stack_Queue;

import java.util.Scanner;

public class Stack_Imple {
    int top = -1;
    int [] arr;
    static int size;
    public Stack_Imple(int size){
        arr = new int[size];
    }
    public Stack_Imple(){
        arr = new int[10];
    }
    public void push(int n){
        if(top > size){
            System.out.println("****** Warning! Stack is full ******* \n Exiting...");
            System.exit(1);
        }
        top = top+1;
        arr[top]=n;
    }
    public void top(){
        if(top == -1){
            System.out.println("***** Stack is Empty ***** \n Exiting...");
            System.exit(1);
        }else{
            System.out.println(arr[top]);
        }
    }

    public void pop(){
        if(top == -1){
            System.out.println("***** Stack is Empty ***** \n Exiting....");
            System.exit(1);
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
         for(int i = 0 ; i < size ;i++){
             System.out.print("Enter element " + (i+1)+ ": " );
             stack.push(sc.nextInt());
         }
            stack.pop();
            stack.pop();
            stack.pop();
            stack.pop();
            stack.pop();
            stack.pop();
    }
}
