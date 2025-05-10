class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        int c = 0;
        int x = Math.min(k, numOnes);
        c += x;
        k -= x;
        int y = Math.min(k, numZeros);
        k -= y;
        int z = Math.min(k, numNegOnes);
        c -= z;
        return c;
    }
}
