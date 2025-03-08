class Solution {
    public int countGoodSubstrings(String s) {
        if (s.length() < 3) return 0;
        HashMap<Character,Integer> hm=new HashMap<>();
        int c=0;
        int r=3;
        for(int i=0;i<r;i++){
            hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i),0)+1);
        }
        if(hm.size()==3) c++;
        for(int j=r;j<s.length();j++){
            hm.put(s.charAt(j), hm.getOrDefault(s.charAt(j), 0) + 1);
            if (hm.get(s.charAt(j-3)) == 1) {
                hm.remove(s.charAt(j-3));
            } else {
                hm.put(s.charAt(j-3), hm.get(s.charAt(j-3)) - 1);
            }

            if (hm.size() == 3) c++;
        }
return c;
        
    }
}