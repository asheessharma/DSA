package SampleMap;

public class Practice2 {
    Node head;
    private int size;
    Practice2(){
        this.size=0;
    }
    class Node{
        String data;
        Node next;
        public Node(String data){
            this.data=data;
            this.next=null;
        }
    }
    public void addFirst(String data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;

    }
    public void addLast(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
        size++;
    }
    public void print(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data + " -> ");
            curr=curr.next;
        }
        System.out.println();
    }
    public void removeFirst(){
        if(head.next==null){
            head=null;
            return;
        }

        head=head.next;
        size--;

    }
    public void removeLast(){
        if(head==null){
            System.out.println("the list is empty");
            return;
        }
        size--;
        if(head.next==null){
            head=null;
            return;
        }
        Node secondLast=head;
        Node lastNode=head.next;
        while(lastNode.next!=null){
            lastNode=lastNode.next;
            secondLast=secondLast.next;
        }
        secondLast.next=null;

    }
    public  void getSize(){
        System.out.println(size);
        return;
    }

    public void reverseList(){
        if(head==null ||  head.next==null){
            System.out.println("Not Possible");
            return;
        }
        Node prev=null;
        Node curr=head;
        Node next=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;


    }

    public static void main(String[] args) {
        Practice2 ll=new Practice2();
        ll.addFirst("ashish");
        ll.addFirst("Mr.");
        ll.addLast("is");
        ll.addLast("unplaced");
        ll.addLast("zzz");
        ll.print();
        ll.getSize();
        ll.reverseList();
        ll.print();
        ll.removeFirst();
        ll.removeLast();
        ll.print();
        ll.getSize();


    }
}
