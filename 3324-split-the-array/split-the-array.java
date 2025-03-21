class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        Map<Integer,Integer> m = new HashMap<>();
        for(int i:nums)
        {
            m.put(i,m.getOrDefault(i,0)+1);
        }
        for(int i:m.values())
        {
            if(i>2)return false;
        }
        return true;
    }
}