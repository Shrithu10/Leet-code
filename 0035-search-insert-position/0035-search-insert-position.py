class Solution:
    def searchInsert(self, nums: List[int], target: int) -> int:
        if target not in nums:
            nums.append(target)
            b=nums.sort()
            c=nums.index(target)
            return c
        else:
            return (nums.index(target))