package LinkedList;


public class AddTwoNumLL {
    public static void main(String[] args) {
        Node head1 = new Node(1);
        head1.next = new Node(3);
        head1.next.next = new Node(2);
        head1.next.next.next = new Node(4);

        Node h2 = new Node(2);
        h2.next = new Node(7);
        h2.next.next = new Node(9);

        ReverseLinkList.printLinkedList(sum(head1,h2));

    }
    private static Node sum(Node l1 , Node l2){
        Node dummy = new Node(-1);
        Node curr = dummy;
        Node t1 = l1;
        Node t2 = l2;
        int carry = 0;
        while(t1!=null || t2 != null){
            int sum = carry;
            if(t1!=null) sum+=t1.data;

            if(t2!=null) sum+=t2.data;
            Node newNode = new Node(sum % 10);
            carry = sum / 10;
            curr.next = newNode;
            curr = curr.next;

            if(t1!=null) t1 = t1.next;
            if(t2!=null) t2 = t2.next;
        }
        if(carry != 0) {
            Node newNode = new Node(carry);
            curr.next=newNode;
        }
        return dummy.next;
    }
}
