class Solution:
    def countEven(self, num: int) -> int:
        c=0
        for i in range(1,num+1):
            s=str(i)
            sum=0
            for i in s:
                sum=sum+int(i)
            if sum%2==0:
                c=c+1
        return c