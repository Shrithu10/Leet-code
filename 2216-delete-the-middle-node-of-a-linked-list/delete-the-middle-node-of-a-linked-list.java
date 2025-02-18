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
    public ListNode deleteMiddle(ListNode head) {
        if(head==null || head.next==null) return null;
        ListNode temp=middleNode(head);

        if (head.next != null && head.next.next == null) {
            head.next = null;  
            return head;
        }

        if(temp != null && temp.next != null){
            temp.val=temp.next.val;
            temp.next=temp.next.next;
            }
        return head;
    }
    public ListNode middleNode(ListNode head) {
        ListNode n1=head;
        ListNode n2=head;

        while( n2 != null && n2.next != null ){
            n2=n2.next.next;
            n1=n1.next;

        }
        return n1;
    }
}