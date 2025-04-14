class Solution {
    public int findLHS(int[] nums) {
        int max=0;
        Arrays.sort(nums);
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int num:nums){
            hm.put(num,hm.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry:hm.entrySet()){
            int a=entry.getKey();
            int b=a+1;
            if(hm.containsKey(b)){
                max=Math.max(hm.get(a)+hm.get(b),max);
            }
        }
        return max;
    }
}