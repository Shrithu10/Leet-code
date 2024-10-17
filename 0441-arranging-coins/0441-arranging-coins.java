class Solution {
    public int arrangeCoins(int n) {
      int low=0;
      int high=n;
      while(low<=high){
        long mid=low+(high-low)/2;
        if((long)(mid*(mid+1))/2==n){
            return (int)mid;
        }
        if((long)(mid*(mid+1))/2<n){
            low=(int)mid+1;
        }
        else{
            high=(int)mid-1;
        }
      }
      return high;

    }
}