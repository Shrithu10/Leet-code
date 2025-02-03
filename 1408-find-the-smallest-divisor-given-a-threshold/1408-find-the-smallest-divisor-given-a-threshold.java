class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        
        Arrays.sort(nums);
        int low=1;
        int high=nums[nums.length-1];
        while(low<high){
            
            int s=0;
            int mid=low+(high-low)/2;
            for(int i=0;i<nums.length;i++){
                s=s+(int)Math.ceil((double)nums[i]/mid);
                
            }
            if(s>threshold){
                low=mid+1;
            }
            else{
                high=mid;
            }
            
        }return low;
    }
}