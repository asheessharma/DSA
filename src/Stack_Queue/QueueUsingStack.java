package Stack_Queue;

import java.util.Stack;

class Q{
    Stack<Integer> first = new Stack<>();
    Stack<Integer> second = new Stack<>();
    void enQ(int x){
        while(first.size()>0){
            second.push(first.pop());
        }
        first.push(x);
        while(second.size()>0){
            first.push(second.pop());
        }
    }

    int dQ(){
        return first.pop();
    }
    int peekQ(){
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
