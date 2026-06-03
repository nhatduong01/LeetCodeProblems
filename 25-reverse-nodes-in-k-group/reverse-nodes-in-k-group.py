# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def get_size(self, head):
        size = 0
        curr = head
        while curr is not None:
            curr = curr.next
            size += 1
        return size
    
    def get_next_node(self, curr, k):
        idx = 0
        while idx < k:
            curr = curr.next
            idx += 1
        return curr
    
    def reverse(self, head, k):
        prev, curr = None, head
        for _ in range(k):
            nxt = curr.next
            curr.next = prev
            prev = curr
            curr = nxt
        # prev = neuer Kopf, head = neues Ende (zeigt noch falsch)
        return prev, head

        

    def get_new_head(self, head, k):
        idx = 0
        while idx < k - 1:
            head = head.next
            idx += 1
        return head


    def reverseKGroup(self, head: Optional[ListNode], k: int) -> Optional[ListNode]:
        if k == 1:
            return head
        size = self.get_size(head)
        if size < k:
            return head
        curr = head
        new_head = self.get_new_head(head, k)
        prev_node = None
        idx = 0
        while idx + k <= size:
            next_node = self.get_next_node(curr, k)
            start, end = self.reverse(curr, k)
            if prev_node is not None:
                prev_node.next = start
            prev_node = end
            end.next = next_node
            curr = next_node
            idx += k
        return new_head