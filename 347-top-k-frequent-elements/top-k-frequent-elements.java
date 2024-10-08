class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hashtable = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(hashtable.containsKey(nums[i])){
                hashtable.put(nums[i],hashtable.get(nums[i])+1);
            }
            else{
            hashtable.put(nums[i],1);
        }

        }
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(
            (a,b) -> hashtable.get(b) - hashtable.get(a)
        );
        for(int num : hashtable.keySet()) {maxHeap.add(num);}
        int[] result=new int[k];
        for(int i=0;i<k;i++){
            result[i]=maxHeap.poll();
        }
        return result;
    }
}