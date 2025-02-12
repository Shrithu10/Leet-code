import java.util.Arrays;

class Solution {
    public int maximumSum(int[] nums) {
        nums = Arrays.stream(nums)
                     .boxed()
                     .sorted((a, b) -> {
                         int temp1 = sumOfDigits(a);
                         int temp2 = sumOfDigits(b);
                         if (temp1 == temp2) {
                             return a - b;
                         } else {
                             return temp1 - temp2;
                         }
                     })
                     .mapToInt(Integer::intValue)
                     .toArray();
        int max=-1;
        int n = nums.length;
        for (int i = 0; i <n-1; i++) {
            if(sumOfDigits(nums[i])==sumOfDigits(nums[i+1])) max=Math.max(max,nums[i]+nums[i+1]);
        }
        return max;
    }

    static int sumOfDigits(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}
