package LinkedList;



//Given the head of a linked list, return the node where the cycle begins. If there is no cycle, return null.
public class LLCycle2 {
    private static Node findCycle(Node head){
        if(head==null || head.next==null){
            return null;
        }
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                fast = head;
                while(slow!=fast){
                    slow=slow.next;
                    fast=fast.next.next;
                }
                return slow;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(3);
        head.next.next = new Node(2);
        head.next.next.next = new Node(4);
        head.next.next.next.next=new Node(2);
        System.out.println(findCycle(head));
    }

}
