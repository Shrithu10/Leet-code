class Solution {
    public int minOperations(int[] nums, int k) {
    PriorityQueue<Long> pq = new PriorityQueue<>();
    int c=0;
    for(int num:nums){
        pq.add((long)num);
    }
    while(pq.size()>1){
    long x=pq.poll();
    long y=pq.poll();
    if(x<k ){
        long z=Math.min(x,y) * 2 + Math.max(x,y);
        System.out.println("x" +  x);
        System.out.println("y"+ y);
        System.out.println("z"+ z);
        c=c+1;
        pq.add(z);
    }
    else{
        break;
    }
    }
    return c;
    }
}