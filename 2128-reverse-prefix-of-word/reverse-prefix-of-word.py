class Solution:
    def reversePrefix(self, word: str, ch: str) -> str:
        a = word.find(ch)
        if a == -1:
            return word
        aa = word[:a+1][::-1]
        aa = aa + word[a+1:]
        return aa
