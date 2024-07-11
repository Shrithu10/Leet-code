/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */class Solution {
public:
    ListNode* reverseList(ListNode* head) {
        if (head == nullptr || head->next == nullptr)
            return head;
        
        std::stack<int> s;
        ListNode* current = head;
        
        // Push values onto the stack
        while (current != nullptr) {
            s.push(current->val);
            current = current->next;
        }
        
        // Create a new reversed linked list
        ListNode* new_head = new ListNode(s.top());
        s.pop();
        current = new_head;
        
        while (!s.empty()) {
            current->next = new ListNode(s.top());
            s.pop();
            current = current->next;
        }
        
        return new_head;
    }
};