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
        int c=len(head);
        ListNode temp=head;
        if (n == c) {
            return head.next;
        }
        for(int i=1;i<c+1;i++){
            if(i==c-n){
                temp.next=temp.next.next;
            }
            else{
                temp=temp.next;
            }
        }
        return head;
    }

    static int len(ListNode head){
        int c=0;
        while(head!=null){
            c=c+1;
            head=head.next;
        }
        return c;
    }
}