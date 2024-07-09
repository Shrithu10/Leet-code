class Solution:
    def maximumValue(self, strs: List[str]) -> int:
        s=[]
        for i in strs:
            try:
                float(i)
                s.append(int(i))
            except ValueError:
        
                if i.isalnum():
                    s.append(len(i))
                elif i.isalpha():
                    s.append(len(i))

        return(max(s))
            