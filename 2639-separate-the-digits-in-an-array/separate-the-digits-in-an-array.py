class Solution:
    def separateDigits(self, nums: List[int]) -> List[int]:
        arr = []

        for n in nums:
            d = []

            while n > 0:
                d.append(n % 10)
                n = n // 10
            d.reverse()
            arr.extend(d)
        return arr