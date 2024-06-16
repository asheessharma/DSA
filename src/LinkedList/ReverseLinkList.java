package LinkedList;
class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
        this.next=null;
    }
    public Node(int data,Node next){
        this.data=data;
        this.next=next;
    }
}
public class ReverseLinkList {
    public static void printLinkedList(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data);
            temp=temp.next;
            System.out.print(" ");
        }
        System.out.println();
    }
    private static Node reverseList(Node head){

        Node curr=head;
        Node prev=null;
        Node next=null;
        while(curr!=null){
             next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;


        }
        return prev;
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(3);
        head.next.next = new Node(2);
        head.next.next.next = new Node(4);
        printLinkedList(head);
        head=reverseList(head);
        System.out.println("Reversed LinkedList");
        printLinkedList(head);
    }




}
