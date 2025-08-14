class Solution {
    public String largestGoodInteger(String num) {
        int maxNum = -1;
        int i = 0;
        
        while (i < num.length() - 2) {
            if (num.charAt(i) == num.charAt(i + 1) && num.charAt(i) == num.charAt(i + 2)) {
                maxNum = Math.max(maxNum, num.charAt(i) - '0');
                i += 3;
            } else {
                i++;
            }
        }
        
        return maxNum == -1 ? "" : String.valueOf(maxNum).repeat(3);
    }
}