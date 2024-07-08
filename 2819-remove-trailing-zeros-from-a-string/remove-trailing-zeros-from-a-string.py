class Solution:
    def removeTrailingZeros(self, num: str) -> str:
        n = list(num)
        
        i = len(n) - 1
        while i >= 0 and n[i] == '0':
            n.pop(i) 
            i -= 1
        
        if not n:
            return "0"
        
        return ''.join(n)