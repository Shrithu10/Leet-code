class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        
        for(int i=0;i<nums1.length;i++){
            int low=0;
        int high=nums2.length-1;
            while(low<=high){
                int mid = low + (high - low) / 2;
                if(nums1[i]==nums2[mid]){
                    return nums1[i];
                }
                else if(nums1[i]>nums2[mid]){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }
        }return -1;
    }
}