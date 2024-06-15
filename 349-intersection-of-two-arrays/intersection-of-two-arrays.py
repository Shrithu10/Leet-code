class Solution(object):
    def intersection(self, nums1, nums2):
        d=[]
        for item in nums1:
            if item in nums2:
                d.append(item)
        return set(d)
        