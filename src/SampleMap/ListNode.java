package SampleMap;

import java.util.List;
public class ListNode {
    int data;
    ListNode next;
    public ListNode(int data){
        this.data=data;
        next=null;
    }
    public ListNode(int data, ListNode next){
        this.data=data;
        this.next=next;
    }
}
class Solution{
    public ListNode addTwoNumbers(ListNode l1,ListNode l2){
        ListNode dummy=new ListNode(0);
        ListNode temp=dummy;
        int carry=0;
        while(l1!=null || l2!=null){
            int x=(l1!=null)?l1.data:0;
            int y=(l2!=null)?l2.data:0;
            int sum=carry+x+y;
            carry=sum/10;
            temp.next=new ListNode(sum%10);
            temp=temp.next;
            if(l1!=null) l1=l1.next;
            if(l2!=null) l2=l2.next;
        }
        if(carry>0){
            temp.next=new ListNode(carry);
        }
        return dummy.next;
    }
    public static void main(String[] args) {
        ListNode head=new ListNode(1);
        head.next=new ListNode(3);
    }
}
