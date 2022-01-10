/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
#include<unordered_set>
class Solution {
public:
    bool hasCycle(ListNode *head) 
    {
        ListNode* temp = head;
        unordered_set <unsigned long int> storage;
        while(temp)
        {
            if (storage.find((unsigned long int)temp) == storage.end())
                storage.insert((unsigned long int)temp);
            else
                return true;
            temp = temp->next;
        }
        return false;
    }
};