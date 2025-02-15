class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> s1=new HashSet<>();
         for (int element : nums1) {
            s1.add(element);
        }
        HashSet<Integer> s2=new HashSet<>();
         for (int element : nums2) {
            s2.add(element);
        }
        ArrayList<Integer> a=new ArrayList<>();
        for(int i:s1){
            if(s2.contains(i)){
                a.add(i);
            }
        }
        int n=a.size();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=a.get(i);
        }
        return arr;
    }
}