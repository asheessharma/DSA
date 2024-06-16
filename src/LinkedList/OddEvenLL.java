package LinkedList;

import java.util.ArrayList;

public class OddEvenLL {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(3);
        head.next.next = new Node(2);
        head.next.next.next = new Node(4);
        head.next.next.next.next= new Node(9);
        ReverseLinkList.printLinkedList(changingLinks(head));
        System.out.println("******_________*******");
        ReverseLinkList.printLinkedList(brute(head));
    }
    private static Node changingLinks(Node head){
        Node odd = head;
        Node even = head.next;
        Node evenHead = even;
        while(even!=null && even.next!=null){
            odd.next=even.next;
            odd=odd.next;
            even.next=odd.next;
            even=even.next;
        }
        odd.next=evenHead;

        return head;

    }

    private static Node brute(Node head){
        Node temp=head;
        ArrayList <Integer> list  = new ArrayList<>();
        while(temp!=null){
            list.add(temp.data);
            temp=temp.next;
        }
        int odd = 0;
        Node temp1 = head;
        while(odd < list.size()){
            temp1.data=list.get(odd);
            odd+=2;
            temp1=temp1.next;
        }
        int even=1;
        while(even<list.size()){
            temp1.data=list.get(even);
            even+=2;
            temp1=temp1.next;
        }
        return head;
    }


}
