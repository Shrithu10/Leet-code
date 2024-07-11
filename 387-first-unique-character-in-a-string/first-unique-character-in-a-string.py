class Solution:
    def firstUniqChar(self, s: str) -> int:
        non_unique_chars = set()
        unique_chars = set()
        
        for char in s:
            if char in non_unique_chars:
                continue 
            if char in unique_chars:
                unique_chars.remove(char)
                non_unique_chars.add(char)
            else:
                unique_chars.add(char)
        
        
        for index, char in enumerate(s):
            if char in unique_chars:
                return index
        
        
        return -1