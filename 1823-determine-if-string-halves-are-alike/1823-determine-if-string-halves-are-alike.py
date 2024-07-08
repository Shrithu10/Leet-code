class Solution:
    def halvesAreAlike(self, s: str) -> bool:
        sss=False
        c1=0
        c2=0
        l=len(s)
        a=int(l/2)
        s1=s[0:(a)]
        s2=s[a:len(s)]
        print(s1)
        print(s2)
        for i in ['a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U']:
            if i in s1 :

                c1=c1+s1.count(i)
            if i in s2 :
                c2=c2+s2.count(i)
        
        if c1==c2:
            return True
        return False
