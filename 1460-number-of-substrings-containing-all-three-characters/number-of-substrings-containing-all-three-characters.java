class Solution {
    public int numberOfSubstrings(String s) {
        int ans=0;
        int l=0;
        int r=0;
        HashMap<Character,Integer> hm=new HashMap<>();
        while(r<s.length()){
            hm.put(s.charAt(r),hm.getOrDefault(s.charAt(r),0)+1);
            while(hm.size()==3){
                hm.put(s.charAt(l),hm.getOrDefault(s.charAt(l),0)-1);
                if(hm.get(s.charAt(l))==0) hm.remove(s.charAt(l));
                l++;
                ans=ans+s.length()-r;
            }
            r++;
        }
        return ans;
    }
}