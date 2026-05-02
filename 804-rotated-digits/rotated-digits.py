class Solution:
    def rotatedDigits(self, n: int) -> int:
        c = 0
        for i in range(1, n + 1):
            if self.ok(i):
                c += 1
        return c

    def ok(self, x: int) -> bool:
        d = False
        while x > 0:
            r = x % 10
            if r in (3, 4, 7):
                return False
            if r in (2, 5, 6, 9):
                d = True
            x //= 10
        return d