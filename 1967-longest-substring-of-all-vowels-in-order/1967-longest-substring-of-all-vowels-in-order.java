class Solution {
    public int longestBeautifulSubstring(String word) {
        int maxLen = 0, count = 0, uniqueVowels = 0;

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            
            if (i > 0 && c < word.charAt(i - 1)) { 
                count = 0;
                uniqueVowels = 0;
            }

            if (i == 0 || c != word.charAt(i - 1)) { 
                uniqueVowels++; 
            }
            
            count++; 
            
            if (uniqueVowels == 5) { 
                maxLen = Math.max(maxLen, count); 
            }
        }
        
        return maxLen;
    }
}
