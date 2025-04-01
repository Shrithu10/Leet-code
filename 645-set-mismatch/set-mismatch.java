class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] arr=new int[2];
        Arrays.sort(nums);
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(i+1 != nums[i]) arr[1]=i+1;
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        for (int i = 1; i <= nums.length; i++) {
            if (hm.containsKey(i)) {
                if (hm.get(i) > 1) arr[0] = i;
            } else {
                arr[1] = i;
        }
        }
        return arr;
    }
}