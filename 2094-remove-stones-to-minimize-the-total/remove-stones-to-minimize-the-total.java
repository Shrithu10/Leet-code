class Solution {
    public int minStoneSum(int[] nums, int k) {
        int s=0;
        PriorityQueue<Integer> max=new PriorityQueue<>((a,b)->b-a);
        for(int i=0;i<nums.length;i++){
            max.add(nums[i]);
            s=s+nums[i];
        }
        while(k>0){
            int n=max.poll();
            max.add(n-n/2);
            s=s-n/2;
            k--;
        }
        return s;
    
    }
}