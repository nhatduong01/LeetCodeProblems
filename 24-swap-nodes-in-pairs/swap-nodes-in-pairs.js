/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} head
 * @return {ListNode}
 */
var swapPairs = function(head) {
    let prev = null
    curr = head
    while(curr != null) 
    {
      if(curr.next != null)
      {
        let next = curr.next
        curr.next = next.next
        next.next = curr
        if (prev)
        {
          prev.next = next
        }
        else
        {
          head = next
        }
      }
      prev = curr
      curr = curr.next
      // console.log("after")
      // printValue(head)
    }
    return head
};