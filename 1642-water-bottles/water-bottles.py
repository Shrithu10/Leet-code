class Solution:
    def numWaterBottles(self, numBottles: int, numExchange: int) -> int:
        count=numBottles
        while(numBottles>=numExchange):
            count=count+(numBottles//numExchange)
            left=numBottles-numExchange*(numBottles//numExchange)
            numBottles=numBottles//numExchange+left
        return count
