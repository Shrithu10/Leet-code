class Solution {
    public boolean canMakeSubsequence(String str1, String str2) {
           // Pointer for str2
        int j = 0;

        for (int i = 0; i < str1.length() && j < str2.length(); i++) {
            char current = str1.charAt(i);
            char next = (char) ((current - 'a' + 1) % 26 + 'a'); // Increment character cyclically

            // Check if the character matches or can be incremented to match
            if (current == str2.charAt(j) || next == str2.charAt(j)) {
                j++; // Move to the next character in str2
            }
        }

        return j == str2.length();
    }
    
}