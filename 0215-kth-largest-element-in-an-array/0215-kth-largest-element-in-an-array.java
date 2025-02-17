class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> p = new PriorityQueue<>();
        for(int i:nums){
            p.add(i);
        }
        for(int i=0;i<nums.length-k;i++){
            p.poll();
        }
        int x=p.poll();
        return x;
    }
}