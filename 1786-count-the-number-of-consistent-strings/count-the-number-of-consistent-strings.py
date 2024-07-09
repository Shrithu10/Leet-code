class Solution:
    def countConsistentStrings(self, allowed: str, words: List[str]) -> int:
        c=0
        a=list(allowed)
        a=set(a)
        for i in words:
            aa=list(i)
            aa=set(aa)
            if(aa.issubset(a)):
                c=c+1
        return c
                
        