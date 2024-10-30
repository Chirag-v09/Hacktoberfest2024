ListNode* reverseList(ListNode* head) {
        ListNode *prev  = NULL;
        ListNode* temp = head;

        while(temp){
            ListNode* next = temp->next;
            temp->next = prev;
            prev = temp;
            temp = next;
        }

        return prev;
    }
