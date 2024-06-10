class Solution:
    def heightChecker(self, heights: List[int]) -> int:
        expected=heights.copy()
        expected.sort()
        l=len(heights)
        c=0
        for i in range(0,l):
            if expected[i] != heights[i]:
                c=c+1
        return c
         
        