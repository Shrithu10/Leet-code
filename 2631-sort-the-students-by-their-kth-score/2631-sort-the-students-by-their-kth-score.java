class Solution {
    public int[][] sortTheStudents(int[][] score, int k) {
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < score.length; i++) {
            list.add(new int[]{score[i][k], i});
        }
        list.sort((a, b) -> b[0] - a[0]);
        int[][] sortedScore = new int[score.length][score[0].length];
        for (int i = 0; i < list.size(); i++) {
            sortedScore[i] = score[list.get(i)[1]];
        }
        return sortedScore;
    }
}
