class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int sum = 0;
        for (int i = piles.length - 2; i >piles.length / 3 - 1; i = i - 2) {
            sum = sum + piles[i];
            System.out.println(i);
            System.out.println("c" + piles[i]);
        }
        return sum;
    }
}
