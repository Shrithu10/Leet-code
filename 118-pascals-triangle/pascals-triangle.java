class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<Integer> first = new ArrayList<>();
        List<List<Integer>> arr = new ArrayList<>();
        if (numRows == 0) {
            return arr;
        }
        first.add(1);
        arr.add(first);
        for(int i=1;i<numRows;i++){
            List<Integer> prev=arr.get(i-1);

            List<Integer> curr=new ArrayList<>();
            curr.add(1);
            for(int j=1;j<i;j++){
                curr.add(prev.get(j-1)+prev.get(j));
            }
            curr.add(1);
        
    arr.add(curr);
    }
    return arr;
}
}