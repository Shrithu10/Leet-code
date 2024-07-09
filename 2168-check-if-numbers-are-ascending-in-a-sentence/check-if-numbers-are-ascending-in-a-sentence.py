class Solution:
    def areNumbersAscending(self, s: str) -> bool:
        numbers = list(map(int, re.findall(r'\d+', s)))

        for i in range(1, len(numbers)):
            if numbers[i] <= numbers[i - 1]:
                return False
        return True