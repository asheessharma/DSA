package Stack_Queue;

import java.util.Stack;

class Q{
    Stack<Integer> first = new Stack<>();
    Stack<Integer> second = new Stack<>();
    void enQ(int x){
        while(!first.empty()){
            second.push(first.peek());
            first.pop();
        }
        System.out.println("The Element Pushed is : " + x);
        first.push(x);
        while(!second.empty()){
            first.push(second.peek());
            second.pop();
        }
    }

    int dQ(){
        if(first.empty()) System.out.println( " Stack is Empty ");
        int val = first.peek();
        first.pop();
        return val;
    }
    int peekQ(){
        if(first.empty()){
            System.out.println("Stack is Empty");
        }
        return first.peek();
    }
    int size(){
        return first.size();
    }

}
public class QueueUsingStack {
    public static void main(String[] args) {
        Q queue = new Q();
        queue.enQ(1);
        queue.enQ(2);
        queue.enQ(3);
        queue.enQ(4);
        queue.enQ(5);
        System.out.println(queue.dQ());
        System.out.println(queue.dQ());
        System.out.println(queue.size());


    }

}
