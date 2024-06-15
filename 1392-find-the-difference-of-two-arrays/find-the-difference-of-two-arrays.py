class Solution(object):
    def findDifference(self, nums1, nums2):
        d1=[]
        d2=[]
        d3=[]
        for item in nums1:
            if item not in nums2:
                d1.append(item)
        for item in nums2:
            if item not in nums1:
                d2.append(item)
        d3.append(set(d1))
        d3.append(set(d2))
        return d3