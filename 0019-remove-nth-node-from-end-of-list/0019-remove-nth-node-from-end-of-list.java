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
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
       int count=0;
       int front;
       ListNode temp;
       temp=head;
       while (temp !=null){
        count ++;
        temp=temp.next;
       }
       front =count-n+1;
       temp=head;
       if(front==1){
        head= temp.next;
       }
       for(int i=1; i<front-1 ; i++){
        temp=temp.next;
       }
        if(temp.next!=null  ){
        temp.next=temp.next.next;
       }
       else {
        head= null;
       }
       return head;
    }
}