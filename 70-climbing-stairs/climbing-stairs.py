class Solution(object):
    def climbStairs(self, n):
        if n==1:
            return 1
        if n==2:
            return 2
        t=1
        
        t1=2
        for i in range(2,n):
            ne=t+t1
            t=t1
            t1=ne
        return t1