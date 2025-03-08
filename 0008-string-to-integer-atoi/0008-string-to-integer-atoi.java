class Solution {
    public int myAtoi(String s) {
        long n = 0;
        int x = 1;
        s = s.trim();
        
        if (s.isEmpty()) return 0;
        if (s.charAt(0) == '-') {
            x = -1;
            s = s.substring(1);
        } else if (s.charAt(0) == '+') {
            s = s.substring(1);
        }

        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i))) break;
            n = n * 10 + (s.charAt(i) - '0');
            if (x * n < Integer.MIN_VALUE) return Integer.MIN_VALUE;
            if (x * n > Integer.MAX_VALUE) return Integer.MAX_VALUE;
        }

        return (int) (x * n);
    }
}
