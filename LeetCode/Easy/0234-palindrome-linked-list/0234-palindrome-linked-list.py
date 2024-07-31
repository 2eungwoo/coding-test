# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def isPalindrome(self, head: Optional[ListNode]) -> bool:
        q = collections.deque()

        if(head is None): # if not head
            return True

        node = head

        while(node is not None):
            q.append(node.val)
            node = node.next
        
        for i in range(len(q)):
            if(q[i] == q[-i-1]):
                continue
            return False
        return True