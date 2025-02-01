class Solution {
    public int minimumSum(int num) {
        String s=String.valueOf(num);
        char[] nums = s.toCharArray();
        Arrays.sort(nums);
        int new1=0;
        int new2=0;
        for(int i=0;i<nums.length;i++){
           if (i % 2 == 0) {
                new1 = new1 * 10 + (nums[i] - '0');
            } else {
                new2 = new2 * 10 + (nums[i] - '0');
            }
        }
        return (new1+new2);
    }
}