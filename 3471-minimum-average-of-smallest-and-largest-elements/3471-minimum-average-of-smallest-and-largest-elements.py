class Solution:
    def minimumAverage(self, nums: List[int]) -> float:
        a=[]
        while(len(nums)>0):
            ma=max(nums)
            mi=min(nums)
            avg=(ma+mi)/2
            a.append(avg)
            nums.remove(mi)
            nums.remove(ma)
        return min(a)