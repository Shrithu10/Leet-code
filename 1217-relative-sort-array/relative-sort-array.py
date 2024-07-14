class Solution:
    def relativeSortArray(self, arr1: List[int], arr2: List[int]) -> List[int]:
        a=[]
        for i in arr2:
            for j in range(0,arr1.count(i)):
                a.append(i)
        b=[]
        for i in arr1:
            if i not in a:
                b.append(i)
        b.sort()
        return a+b