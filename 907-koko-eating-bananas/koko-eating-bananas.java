class Solution {
    public int minEatingSpeed(int[] piles, int h) {
    
            int low=1;
            int high = piles[0];
            for (int i = 1; i < piles.length; i++) {
            if (piles[i] > high) {
                high = piles[i];
                }
                    }
            while(low<high){
                int mid=low+(high-low)/2;
                int s=0;
                for(int j=0;j<piles.length;j++){
                    s=s+ (int) Math.ceil((double) piles[j] / mid);
                }
                if(s<=h){
                    high=mid;
                }
                else{
                    low=mid+1;
                }
            }
        return low;
    }
}