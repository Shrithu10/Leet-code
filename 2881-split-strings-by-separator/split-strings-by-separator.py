class Solution:
    def splitWordsBySeparator(self, words: List[str], separator: str) -> List[str]:
        b=[]
        c=[]
        for i in words:
            b=b+i.split(separator)
        for i in b:
            if(i!=""):
                c.append(i)
        return c