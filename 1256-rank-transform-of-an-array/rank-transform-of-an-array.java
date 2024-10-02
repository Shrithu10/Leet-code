class Solution {
    public int[] arrayRankTransform(int[] arr) {
       int[] a=arr.clone();
       Arrays.sort(a);
       HashMap<Integer,Integer> count= new HashMap<Integer,Integer>();
      int rank = 1;
for (int i = 0; i < a.length; i++) {
            if (!count.containsKey(a[i])) {
                count.put(a[i], rank);
                rank++;
            }
        }
    for(int i=0;i<arr.length;i++){
        arr[i]=count.get(arr[i]);
    }
    return arr;
    }
}