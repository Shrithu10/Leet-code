class Solution {
    public int equalPairs(int[][] grid) {
        int m = grid.length;
        List<List<Integer>> row = new ArrayList<>();
        List<List<Integer>> col = new ArrayList<>();
        
        for (int i = 0; i < m; i++) {
            List<Integer> list = new ArrayList<>();
            for (int num : grid[i]) {
                list.add(num);
            }
            row.add(list);
        }
        
        for (int j = 0; j < m; j++) {
            List<Integer> a = new ArrayList<>();
            for (int i = 0; i < m; i++) {
                a.add(grid[i][j]);
            }
            col.add(a);
        }

        int count = 0;
        for (List<Integer> r : row) {
            for (List<Integer> c : col) {
                if (r.equals(c)) {
                    count++;
                }
            }
        }
        
        return count;
    }
}
