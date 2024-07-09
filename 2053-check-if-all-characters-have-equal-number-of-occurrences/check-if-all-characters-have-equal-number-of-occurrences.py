class Solution:
    def areOccurrencesEqual(self, s: str) -> bool:
        d={}
        ss=set(list(s))
        for i in ss:
            d[i]=s.count(i)
        res = len(list(set(list(d.values())))) == 1
        return res