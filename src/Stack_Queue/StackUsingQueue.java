package Stack_Queue;
import java.util.*;
class stack{
    Queue<Integer> q = new LinkedList<>();
    void push(int x){
        q.add(x);
        for(int i = 0;i < q.size() - 1; i++){
            q.add(q.remove());
        }
    }
    int pop(){
        return q.remove();
    }
    int top(){
        if(!q.isEmpty()){
            return q.peek();
        }
        return -1;
    }
    int size() {
        return q.size();
    }

}

public class StackUsingQueue {
    public static void main(String[] args) {
        stack s = new stack();
        s.push(2);
        s.push(12);
        s.push(22);
        s.push(32);
        s.push(42);
        System.out.println(s.top());
        System.out.println("Popped : "+s.pop());
        System.out.println("Size : "+s.size());
    }
}
