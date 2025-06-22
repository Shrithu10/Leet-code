class Solution {
    public String[] divideString(String s, int k, char fill) {
        int n = s.length();
        int x = (n + k - 1) / k;
        String[] arr = new String[x];

        for (int i = 0, index = 0; i < n; i += k, index++) {
            arr[index] = s.substring(i, Math.min(i + k, n));
        }

        int lastIndex = x - 1;
        if (arr[lastIndex].length() < k) {
            StringBuilder sb = new StringBuilder(arr[lastIndex]);
            while (sb.length() < k) {
                sb.append(fill);
            }
            arr[lastIndex] = sb.toString();
        }

        return arr;
    }}