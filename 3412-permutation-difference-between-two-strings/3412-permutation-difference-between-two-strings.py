class Solution:
    def findPermutationDifference(self, s: str, t: str) -> int:
        total=0
        for letter in s:
            sum=(t.rfind(letter)-s.rfind(letter))
            if sum<0:
                total=total+(-sum)
            else:
                total=total + sum
        return total
        