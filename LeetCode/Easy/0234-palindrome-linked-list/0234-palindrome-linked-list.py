# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def isPalindrome(self, head: Optional[ListNode]) -> bool:
        q = []

        if(head is None): # if not head
            return True

        node = head

        while(node is not None):
            q.append(node.val)
            node = node.next
        
        if(q == q[::-1]):
            return True
        else:
            return False