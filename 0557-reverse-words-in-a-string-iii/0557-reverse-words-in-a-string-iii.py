class Solution:
    def reverseWords(self, s: str) -> str:
        l=s.split()
        a=[]
        for i in l:
            a.append(i[::-1])
        return ' '.join(a)