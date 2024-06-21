class Solution(object):
    def plusOne(self, digits):
        s=""
        for i in digits:
            s=s+str(i)
        x=int(s)+1
        list=[]
        for letter in str(x):
            list.append(int(letter))
        return list