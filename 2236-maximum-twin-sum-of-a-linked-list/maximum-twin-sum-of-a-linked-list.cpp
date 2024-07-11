/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    int pairSum(ListNode* head) {
        int length = 0;
        ListNode* current = head;
        while (current != nullptr) {
            length++;
            current = current->next;
        }

        stack<int>s;
        current=head;
        for (int i=0;i<length/2;i++){
            s.push(current->val);
            current = current->next;
        }
        int max=0;
        while (current != nullptr) {
            int t = s.top() + current->val;
            s.pop();
            if (t > max) {
                max= t;
            }
            current = current->next;
        }return max;
    }
};