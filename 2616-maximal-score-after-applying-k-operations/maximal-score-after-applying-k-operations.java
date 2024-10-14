class Solution {
    public long maxKelements(int[] nums, int k) {
        long s=0;
        PriorityQueue<Integer> max=new PriorityQueue<>((a,b)->b-a);
        for(int i=0;i<nums.length;i++){
            max.add(nums[i]);
        }
        while(k>0){
            int n=max.poll();
            s+=n;
            max.add(((n + 2)/3));
            k--;
        }
        return s;
    }
}