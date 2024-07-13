class Solution:
    def isFascinating(self, n: int) -> bool:
        concatenated = str(n) + str(2 * n) + str(3 * n)
        sorted_digits = sorted(concatenated)
        return sorted_digits == ['1', '2', '3', '4', '5', '6', '7', '8', '9']
