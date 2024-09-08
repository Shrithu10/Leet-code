class Solution:
    def getFinalState(self, nums: List[int], k: int, multiplier: int) -> List[int]:
        def find_min_index(nums: List[int]) -> int:
            return nums.index(min(nums))
        
        while k > 0:
            min_index = find_min_index(nums)
            nums[min_index] *= multiplier
            k -= 1
        
        return nums
