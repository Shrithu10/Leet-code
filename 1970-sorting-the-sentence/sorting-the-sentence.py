class Solution:
    def sortSentence(self, s: str) -> str:
        words = s.split() 
        sorted = [""] * len(words)
        
        for word in words:
            index = int(word[-1])-1
            print(index)
            sorted[index] = word[:-1] 
        
        return " ".join(sorted) 
