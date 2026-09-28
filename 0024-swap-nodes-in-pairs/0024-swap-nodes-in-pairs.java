/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
 class swap {
    
    ListNode myhead;
    swap (ListNode head){
        this.myhead = head;
    }
    ListNode swapfirsttwo(){
       return swapfirsttwo(myhead);
    }
   private ListNode swapfirsttwo(ListNode head){

    if(head==null || head.next==null)
        return head;
    
    ListNode second=head.next;
    head.next=swapfirsttwo(second.next);
    second.next=head;
    return second;
}
    }
class Solution {
    public ListNode swapPairs(ListNode head) {
        swap sc=new swap(head);
        return sc.swapfirsttwo();
    }
}