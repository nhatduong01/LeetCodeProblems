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
    ListNode* addTwoNumbers(ListNode* l1, ListNode* l2)
    {
      ListNode* finalList = new ListNode();
      ListNode* curr = finalList;
      int carry = 0;
      while (l1||l2)
      {
        int first = l1? l1->val : 0;
        int second = l2? l2->val : 0;
        int temp_result = first + second + carry;
        carry = 0;
        if(temp_result > 9)
        {
          temp_result -= 10;
          carry = 1;
        }
        ListNode* newNode = new ListNode(temp_result,nullptr);
        curr->next = newNode;
        curr = newNode;
        if(l1)
          l1 = l1->next;
        if(l2)
          l2 = l2->next;
        if (!l1&&!l2&&carry)
        {
          ListNode* additionalNode = new ListNode(1, nullptr);
          curr->next = additionalNode;
          curr = additionalNode;
        }
      } 
      curr = finalList;
      finalList = finalList->next;
      delete curr;
      return finalList;
    }
};