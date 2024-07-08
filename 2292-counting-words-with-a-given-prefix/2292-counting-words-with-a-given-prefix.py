class Solution:
    def prefixCount(self, words: List[str], pref: str) -> int:
        c=0
        a=len(pref)
        for i in words:
            if i[0:a]==pref:
                c=c+1
        return c