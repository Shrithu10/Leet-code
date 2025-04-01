class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int s=0;
        for(int i=0;i<nums.size();i++){
            if(check(i,k)) s=s+nums.get(i);
        }
        return s;
    }
    public static boolean check(int n,int k){
        int c=0;
        String b=Integer.toBinaryString(n);
        for(int i=0;i<b.length();i++){
            if(b.charAt(i)=='1') c++;
        }
        return (c==k);
    }
}