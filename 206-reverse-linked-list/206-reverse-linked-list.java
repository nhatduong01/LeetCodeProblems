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
    public ListNode reverseList(ListNode head) {
      ListNode result = new ListNode();
      ListNode prevNode = new ListNode();
      ListNode currNode = new ListNode();
      result = prevNode = currNode = head;
      if(currNode != null)
        {
          currNode = currNode.next;
          prevNode = prevNode.next;
          result.next = null;
        }

      while(currNode != null)
      {
        currNode = currNode.next;
        prevNode.next = result;
        result = prevNode;
        prevNode = currNode;
      }
      return result;   
        
    }
}