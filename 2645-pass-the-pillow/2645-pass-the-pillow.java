class Solution {
    public int passThePillow(int n, int time) {
        int cycle = 2 * (n - 1);
        int mod = time % cycle;
        
        if (mod < n - 1) {
            return 1 + mod;
        } else {
            return 2 * n - 1 - mod;
        }
    }
}