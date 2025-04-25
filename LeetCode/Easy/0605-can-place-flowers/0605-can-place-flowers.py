class Solution:
    def canPlaceFlowers(self, flowerbed: List[int], n: int) -> bool:
        for pos in range(len(flowerbed)):
            left, right = pos - 1, pos + 1
            if(flowerbed[pos] == 0):
                if(flowerbed[left] == 0 and flowerbed[right] == 0):
                    flowerbed[pos] = 1
                    n -= 1
                elif(left < 0 and flowerbed[right] == 0):
                    flowerbed[pos] = 1
                    n -= 1
                elif(right < len(flowerbed) and flowerbed[left] == 0):
                    flowerbed[pos] = 1
                    n -= 1

            if(n<=0):
                return True

        return False
