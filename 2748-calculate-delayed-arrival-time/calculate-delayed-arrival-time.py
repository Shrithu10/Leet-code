class Solution:
    def findDelayedArrivalTime(self, arrivalTime: int, delayedTime: int) -> int:
        t=arrivalTime+delayedTime
        if(t>=24):
            return t-24
        return t