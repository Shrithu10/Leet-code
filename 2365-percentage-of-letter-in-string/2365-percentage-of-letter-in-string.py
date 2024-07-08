class Solution:
    def percentageLetter(self, s: str, letter: str) -> int:
        c=s.count(letter)
        if c!=0:
            return (int(int(c*100)/(len(s))))
        return 0