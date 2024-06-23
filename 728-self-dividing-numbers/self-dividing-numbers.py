

class Solution:
    def selfDividingNumbers(self, left: int, right: int) -> List[int]:
        def is_self_dividing(num):
            s = str(num)
            for letter in s:
                if letter == '0' or num % int(letter) != 0:
                    return False
            return True
        
        aA = []
        for i in range(left, right + 1):
            if is_self_dividing(i):
                aA.append(i)
        
        return aA
