class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals ,(a,b) -> a[0]- b[0]);
        ArrayList<int[]> arr=new ArrayList<>();
        int[] curr=intervals[0];
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]<=curr[1]){
                curr[1]=Math.max(curr[1],intervals[i][1]);
            }
            else if(intervals[i][0]>curr[1]){
                arr.add(curr);
                curr=intervals[i];
                
            }
            }arr.add(curr);
            return arr.toArray(new int[arr.size()][]);
            }
        }
    
