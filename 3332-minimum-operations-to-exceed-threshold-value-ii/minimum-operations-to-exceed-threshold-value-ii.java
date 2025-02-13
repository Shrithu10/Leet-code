class Solution {
    public int minOperations(int[] nums, int k) {
    PriorityQueue<Long> pq = new PriorityQueue<>();
    int c=0;
    for(int num:nums){
        if(num<k){
        pq.add((long)num);
    }}
    while(!pq.isEmpty()){
        if(pq.size()==1){
            c=c+1;
            break;
        }
    long x=pq.poll();
    long y=pq.poll();
    long z=x * 2 + y;
    c=c+1;
    if(z<(long) k) pq.add(z);
    }
    return c;
    }
}
