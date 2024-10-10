class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> arr=new ArrayList<>();
        List<Integer> first = new ArrayList<>();
        first.add(1);
        arr.add(first);
        for(int i=1;i<=rowIndex;i++){
            List<Integer> prev=arr.get(i-1);
            
            List<Integer> curr=new ArrayList<>();
            curr.add(1);
            for(int j=1;j<i;j++){
                curr.add(prev.get(j-1)+prev.get(j));
            }
            curr.add(1);
             arr.add(curr);
        }
        return arr.get(rowIndex);
    }
}