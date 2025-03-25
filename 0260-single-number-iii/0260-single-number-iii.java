class Solution {
    public int[] singleNumber(int[] nums) {
        List<Integer> l = new ArrayList<>();
        for(int i:nums)
        {
            if(!l.contains(i))l.add(i);
            else if(l.contains(i))l.remove(Integer.valueOf(i));
        }
        return l.stream().mapToInt(Integer::intValue).toArray();

    }
}