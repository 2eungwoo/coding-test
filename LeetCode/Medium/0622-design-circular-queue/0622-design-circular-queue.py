class MyCircularQueue:

    def __init__(self, k: int):
        self.q = [None] * k
        self.maxlen = k
        self.p1 = 0
        self.p2 = 0

    def enQueue(self, value: int) -> bool:
        if(self.q[self.p2] is None):
            self.q[self.p2] = value
            self.p2 = (self.p2 + 1) % self.maxlen
            return True
        else:
            return False

    def deQueue(self) -> bool:
        if(self.q[self.p1] is None):
            return False
        else:
            self.q[self.p1] = None
            self.p1 = (self.p1 + 1) % self.maxlen
            return True

    def Front(self) -> int:
        if(self.q[self.p1] is None):
            return -1
        else:
            return self.q[self.p1]
        
    def Rear(self) -> int:
        if(self.q[self.p2 -1] is None):
            return -1
        else:
            return self.q[self.p2 - 1]
        
    def isEmpty(self) -> bool:
        if(self.p1 == self.p2 and self.q[self.p1] is None):
            return True
        else:
            return False

    def isFull(self) -> bool:
        if(self.p1 == self.p2 and self.q[self.p1] is not None):
            return True
        else:
            return False


# Your MyCircularQueue object will be instantiated and called as such:
# obj = MyCircularQueue(k)
# param_1 = obj.enQueue(value)
# param_2 = obj.deQueue()
# param_3 = obj.Front()
# param_4 = obj.Rear()
# param_5 = obj.isEmpty()
# param_6 = obj.isFull()