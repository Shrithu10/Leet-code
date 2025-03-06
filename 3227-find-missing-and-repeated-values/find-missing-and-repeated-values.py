class Solution:
    def findMissingAndRepeatedValues(self, grid: List[List[int]]) -> List[int]:
        a=[]
        for i in grid:
            for j in i:
                a.append(j)
        b=set(a)
        b=list(b)
        b.sort()
        c=[]
        for i in b:
            if a.count(i)>1:
                c.append(i)
        for i in range(1,len(a)+1):
            if i not in b:
                c.append(i)
        return c

