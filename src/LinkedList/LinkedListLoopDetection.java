package LinkedList;

class Node0 {
      int val;
      Node0 next;
      Node0(int x) {
          val = x;
          next = null;
      }
  }
public class LinkedListLoopDetection {
    public static boolean hasCycle(Node0 head) {
        if(head==null ){
            return false;
        }
        Node0 hare=head;
        Node0 turtle=head;
        while(  hare!=null && hare.next!=null ){
            hare=hare.next.next;
            turtle=turtle.next;
            if(hare == turtle){
                return true;
            }
        }

        return false;
    }
    public static void main(String[] args) {

        Node0 head = new Node0(1);
        Node0 second = new Node0(2);
        Node0 third = new Node0(3);
        Node0 fourth = new Node0(4);
        Node0 fifth = new Node0(5);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        // Create a loop
        fifth.next = third;


        if (hasCycle(head)) {
            System.out.println("Loop detected in the linked list.");
        } else {
            System.out.println("No loop detected in the linked list.");
        }


    }
}
