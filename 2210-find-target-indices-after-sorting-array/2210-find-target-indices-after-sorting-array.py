class Solution:
    def targetIndices(self, nums: List[int], target: int) -> List[int]:
        nums.sort()
        a=[]
        for i in range(0,len(nums)):
            if nums[i]==target:
                a.append(i)
        return a
