class Solution {
    public int maxScore(String s) {
        int totalOnes = 0;
        int leftZeroCount = 0;
        int maxScore = 0;

        for (char c : s.toCharArray()) {
            if (c == '1') totalOnes++;
        }

        int rightOnes = totalOnes;

        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == '0') leftZeroCount++;
            else rightOnes--;

            maxScore = Math.max(maxScore, leftZeroCount + rightOnes);
        }

        return maxScore;
    }
}
