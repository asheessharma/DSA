class Node {
      int val;
      Node next;
      Node(int x) {
          val = x;
          next = null;
      }
  }
public class LinkedListLoopDetection {
    public static boolean hasCycle(Node head) {
        if(head==null ){
            return false;
        }
        Node hare=head;
        Node turtle=head;
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

        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);

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
