class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int n = words.length;
        int[] vowelCount = new int[n + 1]; // Prefix sum array

        // Define the vowels
        String vowels = "aeiou";

        // Preprocess words to build the prefix sum array
        for (int i = 0; i < n; i++) {
            String word = words[i];
            char start = word.charAt(0);
            char end = word.charAt(word.length() - 1);
            // Check if the word starts and ends with a vowel
            if (vowels.indexOf(start) != -1 && vowels.indexOf(end) != -1) {
                vowelCount[i + 1] = vowelCount[i] + 1;
            } else {
                vowelCount[i + 1] = vowelCount[i];
            }
        }

        // Answer the queries
        int m = queries.length;
        int[] result = new int[m];
        for (int i = 0; i < m; i++) {
            int li = queries[i][0];
            int ri = queries[i][1];
            // Number of valid strings in range [li, ri]
            result[i] = vowelCount[ri + 1] - vowelCount[li];
        }

        return result;
    }
}
