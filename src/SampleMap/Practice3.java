package SampleMap;

public class Practice3 {
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;

            this.next=null;
        }
    }

        public static Node head;
        public static void push(int data){
            Node newNode=new Node(data);
            if(head==null){
                head=newNode;
                return;
            }
            newNode.next=head;
            head=newNode;
        }
        public static int pop(){
            if(head==null){
                return -1;
            }
            int data=head.data;
            head=head.next;
            return data;
        }
        public static int peek() {
            if (head == null) {
                return -1;
            }
            return head.data;
        }


    public static void main(String[] args) {
        push(3);
        push(4);
        push(5);
        push(1);
        System.out.println(peek());
        while(head!=null){
            System.out.println(pop());
        }
    }
}
