class Solution:
    def isAcronym(self, words: List[str], s: str) -> bool:
        a=""
        for i in words:
            a=a+i[0]
        print (a)
        print(str)
        if a==s:
            return True
        return False