class MyCircularDeque:

    def __init__(self, k: int):
        self.k = k
        self.a = []
        

    def insertFront(self, value: int) -> bool:
        if(not self.isFull()):
            self.a.insert(0,value)
            return True
        else:
            return False
       

    def insertLast(self, value: int) -> bool:
        if(not self.isFull()):
            self.a.append(value)
            return True
        else:
            return False

    def deleteFront(self) -> bool:
        if(not self.isEmpty()):
            del self.a[0]
            return True
        else:
            return False
        
    def deleteLast(self) -> bool:
        if(not self.isEmpty()):
            self.a.pop()
            return True
        else:
            return False
    
    def getFront(self) -> int:
        if(not self.isEmpty()):
            return self.a[0]
        else:
            return -1

    def getRear(self) -> int:
        if(not self.isEmpty()):
            return self.a[-1]
        else:
            return -1

    def isEmpty(self) -> bool:
        return len(self.a) == 0

    def isFull(self) -> bool:     
        return len(self.a) == self.k
        

# Your MyCircularDeque object will be instantiated and called as such:
# obj = MyCircularDeque(k)
# param_1 = obj.insertFront(value)
# param_2 = obj.insertLast(value)
# param_3 = obj.deleteFront()
# param_4 = obj.deleteLast()
# param_5 = obj.getFront()
# param_6 = obj.getRear()
# param_7 = obj.isEmpty()
# param_8 = obj.isFull()