class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int c=0;int cn=1;
        Arrays.sort(intervals ,(a,b)-> a[1]-b[1]);
        int[] curr=intervals[0];
        for(int i=1;i<intervals.length;i++){
        
            if(intervals[i][0]<curr[1]){
                c++;
            }
            else if(intervals[i][0]>=curr[1]){
                cn++;
                curr=intervals[i];
                
            }
        }
        return intervals.length-cn;
        }
    }
