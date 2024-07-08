class Solution:
    def finalString(self, s: str) -> str:
        ss=""
        for i in s:
            if(i!="i"):
                ss=ss+i
            if(i=='i'):
                ss =ss[::-1]
            
        return ss