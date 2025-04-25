class Solution:
    def canPlaceFlowers(self, flowerbed: List[int], n: int) -> bool:
        for i in range(len(flowerbed)):
            left, right = i-1, i+1
            if(flowerbed[i] == 0):
                if(left < 0 or flowerbed[left] == 0) and (right >= len(flowerbed) or flowerbed[right] == 0):
                    flowerbed[i] = 1
                    n -= 1
 
            if(n <= 0):
                return True
        return False