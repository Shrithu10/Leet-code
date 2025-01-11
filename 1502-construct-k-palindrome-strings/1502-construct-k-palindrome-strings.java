class Solution {
    public boolean canConstruct(String s, int k) {
        if (k > s.length()) return false;

        HashMap<Character, Integer> cc= new HashMap<>();
        for (char c : s.toCharArray()) {
            cc.put(c, cc.getOrDefault(c, 0) + 1);
        }

        int o = 0;
        for (int co : cc.values()) {
            if (co % 2 != 0) o++;
        }

        return o <= k;
    }
    
}