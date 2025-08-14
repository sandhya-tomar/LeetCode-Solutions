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
    public ListNode reverseList(ListNode head) {

   ListNode t=head;
   ListNode current=null;
   ListNode previous=null;
   while(t!=null)
   {
    current=t.next;
    t.next=previous;
    previous=t;
    t=current;
   }
   head=previous;
   return head;     
    }
}