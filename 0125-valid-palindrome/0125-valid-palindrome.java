class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder ss = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i))) {
                ss.append(Character.toLowerCase(s.charAt(i)));  }
        }

         String original = ss.toString();
        String reversed = ss.reverse().toString();

        return original.equals(reversed);
    }
}
