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
    public ListNode removeElements(ListNode head, int val) 
    {
      ListNode currNode = head;
      ListNode  temp = new ListNode();
      ListNode result = temp;
      while(currNode!= null)
      {
        if(currNode.val != val)
        {
          ListNode newNode = new ListNode (currNode.val, null);
          temp.next = newNode;
          temp = temp.next;
        }
        currNode = currNode.next;
      }
    return result.next ;    
  }
}