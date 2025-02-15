/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode t1=headA;
        ListNode t2=headB;
        int l1=lenn(headA);
        int l2=lenn(headB);
        if(l1>l2){
            for(int i=0;i<l1-l2;i++){
            t1=t1.next;
            }
        }
        if(l2>l1){
            for(int i=0;i<l2-l1;i++){
            t2=t2.next;
            }
        }
        while(t1!=null && t2!=null){
            if(t1==t2){
                return t1;
            }
            else{
                t1=t1.next;
                t2=t2.next;
            }
        }
        return null;


    }

    static int lenn(ListNode h){
        int c=0;
        while(h!=null){
            c=c+1;
            h=h.next;
        }
        return c;
    }
}