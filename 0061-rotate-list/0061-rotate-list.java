/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) return head;

        int l = len(head);
        k = k % l;
        if (k == 0) return head;

        ListNode temp = head;
        ListNode temp2 = null;

        for (int i = 0; i < l; i++) {
            if (i == l - k % l - 1) {
                temp2 = temp;
            }
            if (i == l - 1) {
                temp.next = head;
            }
            temp = temp.next;
        }

        ListNode newHead = temp2.next;
        temp2.next = null;

        return newHead;
    }

    static int len(ListNode head) {
        int c = 0;
        while (head != null) {
            c++;
            head = head.next;
        }
        return c;
    }
}
