class Solution {
    public int findLength(int[] nums1, int[] nums2) {
        int maxLen = 0;

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                int k = i, l = j;
                while (k < nums1.length && l < nums2.length && nums1[k] == nums2[l]) {
                    k++;
                    l++;
                }
                maxLen = Math.max(maxLen, k - i);
            }
        }

        return maxLen;
    }
}
