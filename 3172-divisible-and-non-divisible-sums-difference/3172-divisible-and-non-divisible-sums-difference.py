class Solution:
    def differenceOfSums(self, n: int, m: int) -> int:
        yes=0
        no=0
        for i in range(0,n+1):
            if(i%m==0):
                yes=yes+i
            else:
                no=no+i
        return no-yes