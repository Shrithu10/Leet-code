import java.util.*;

class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if (digits == null || digits.length() == 0) return res;
        String[] map = {
            "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
        };
        backtrack(res, map, digits, 0, new StringBuilder());
        return res;
    }

    void backtrack(List<String> res, String[] map, String digits, int i, StringBuilder sb) {
        if (i == digits.length()) {
            res.add(sb.toString());
            return;
        }
        String letters = map[digits.charAt(i) - '0'];
        for (char c : letters.toCharArray()) {
            sb.append(c);
            backtrack(res, map, digits, i + 1, sb);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
