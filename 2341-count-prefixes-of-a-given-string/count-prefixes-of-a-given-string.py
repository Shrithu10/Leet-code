class Solution:
    def countPrefixes(self, words: List[str], s: str) -> int:
        c=0
        for i in words:
            if s[0:len(i)]==i:
                c=c+1
        return c