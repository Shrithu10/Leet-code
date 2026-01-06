class Solution {
    public int maxLevelSum(TreeNode r) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(r);
        int lv = 1, ans = 1, mx = Integer.MIN_VALUE;
        while (!q.isEmpty()) {
            int n = q.size(), s = 0;
            for (int i = 0; i < n; i++) {
                TreeNode t = q.poll();
                s += t.val;
                if (t.left != null) q.add(t.left);
                if (t.right != null) q.add(t.right);
            }
            if (s > mx) {
                mx = s;
                ans = lv;
            }
            lv++;
        }
        return ans;
    }
}
