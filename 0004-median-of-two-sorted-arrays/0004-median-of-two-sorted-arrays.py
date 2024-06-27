class Solution:
    def findMedianSortedArrays(self, nums1: List[int], nums2: List[int]) -> float:
        n=nums1+nums2
        a=n.sort()
        s=len(n)
        if (len(n))%2==0:
            s=s/2
            x=(n[(int(s))-1]+n[(int(s)+1)-1])/2
        else:
            s=(s+1)/2
            x=float(n[(int(s))-1])
        return x