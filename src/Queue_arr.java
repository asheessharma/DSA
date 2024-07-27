public class Queue_arr {
    private int [] arr;
    private  int start , end ,currSize , maxSize;
    public Queue_arr(){
        arr = new int[16];
        start = -1 ;
        end = -1;
        currSize = 0;
    }
    public Queue_arr(int size){
        this.maxSize = size;
        arr = new int[maxSize];
        start = -1;
        end = -1;
        currSize = 0;
    }
    public void push(int newEle){
        if(currSize == maxSize){
            System.out.println("**** Queue is full ****\n Exiting....");
            System.exit(1);
        }
        if(end == -1){
            start = 0;
            end = 0;
        }
        else{
            end = (end + 1)% maxSize;
//            end = end + 1;
        }
        arr[end] = newEle;
        System.out.println("The element pushed is : " + newEle);
        currSize++ ;

    }
    public int pop(){
        if(start == -1){
            System.out.println("* * * Empty Queue * * * \n Exiting ...");
            System.exit(1);
        }
        int popped = arr[start];
        if(currSize == 1){
            start = -1;
            end = -1;
        }
        else{
            start = (start + 1) % maxSize;
        }
        currSize-- ;
        return popped;
    }
    public int top() {
        if (start == -1) {
            System.out.println("Empty Queue...");
            System.out.println("Exiting ...");
            System.exit(1);
        }
        return arr[start];
    }
    public int size(){
        return currSize;
    }

    public static void main(String[] args) {
        Queue_arr q = new Queue_arr(5);
        q.push(1);
        q.push(11);
        q.push(111);
        q.push(1111);
        q.push(11111);
        System.out.println("Popped element : " + q.pop());
        System.out.println("Popped element : " + q.pop());
        System.out.println("Top element : " + q.top());
        System.out.println("Queue Size : " + q.size());

    }

}
