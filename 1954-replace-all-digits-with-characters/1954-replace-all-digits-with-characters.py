class Solution:
    def replaceDigits(self, s: str) -> str:
        ss = list(s)  
        for i in range(1, len(ss), 2):  
            if ss[i].isdigit(): 
                shift = int(ss[i])
                ss[i] = chr(ord(ss[i - 1]) + shift)  
        return ''.join(ss)