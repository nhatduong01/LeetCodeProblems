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
    struct ListNode* mergeTwoLists(struct ListNode* list1, struct ListNode* list2)
{

     ListNode* resultList = new ListNode();
    resultList->val = 0;
    resultList->next = 0;
    ListNode *currNode;
    currNode = resultList;
    while(list1 || list2)
    {
        ListNode* newNode = new ListNode();
        //printf("I am here2\n");
        if(list1&&list2)
        {
            //printf("I am here1\n");
            if(list1->val > list2->val)
            {
                newNode->val = list2->val;
                list2 = list2->next;
            }
            else
            {
                newNode->val = list1->val;
                list1 = list1->next;
            }
        }
        else if (list1)
        {
                newNode->val = list1->val;
                list1 = list1->next;
        }
        else
        {
                newNode->val = list2->val;
                list2 = list2->next;
        }
        currNode ->next = newNode;
        currNode = currNode->next;
    }
    currNode = resultList;
    resultList = resultList->next;
    delete(currNode);
    return resultList;
}
};