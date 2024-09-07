class Solution {
    public int[] rearrangeArray(int[] nums) {
       
       List<Integer> num= new ArrayList<Integer>();
       List<Integer> p= new ArrayList<Integer>();
        List<Integer> n= new ArrayList<Integer>();
       for (int i=0;i<nums.length;i++){
        if(nums[i]>0){
            p.add(nums[i]);
        }
       }
       
       for (int i=0;i<nums.length;i++){
        if(nums[i]<0){
            n.add(nums[i]);
        }
       }
       
       for (int i=0;i<nums.length/2;i++){
            num.add(p.get(i));
            num.add(n.get(i));
       }
       int[] result = new int[num.size()];
        for (int i = 0; i < num.size(); i++) {
            result[i] = num.get(i);
        }
        
        return result;
}}