package LinkedList;

import java.util.*;

public class DetectCycle {
    private static boolean hasCycle(Node head){
        Set<Node> set = new HashSet<>();
        Node temp = head;
        while(temp!=null){
            if(set.contains(temp)){
                return true;
            }
            set.add(temp);
            temp=temp.next;
        }
        return false;
    }
    private static boolean floydAlgo(Node head){
        if(head==null) return false;
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(3);
        head.next.next = new Node(2);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(1);
        System.out.println(hasCycle(head));
        System.out.println("*********************************");
        System.out.println(floydAlgo(head));
    }

}
