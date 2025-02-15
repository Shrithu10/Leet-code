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
    public ListNode removeElements(ListNode head, int val) {
                if(head==null) return null;

        if(head.val==val){
            while(head!=null && head.val==val){
                head=head.next;
            }
        }
        ListNode t1=head;
        
        while(t1!=null && t1.next!=null){
            if(t1.next.val==val){
                t1.next=t1.next.next;
            }
            else{
                t1=t1.next;
            }
        }

        return head;
    }
}