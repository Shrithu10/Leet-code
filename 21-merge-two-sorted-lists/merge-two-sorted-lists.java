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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode t3 = new ListNode(0);
        ListNode t4 = t3;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                t4.next = list1;
                list1 = list1.next;
            } else {
                t4.next = list2;
                list2 = list2.next;
            }
            t4 = t4.next;
        }

        if (list1 != null) {
            t4.next = list1;
        } else {
            t4.next = list2;
        }

        return t3.next;
    }
}
