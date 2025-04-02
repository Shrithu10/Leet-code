class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> arr=new ArrayList<>();
        char[] ss=p.toCharArray();
        Arrays.sort(ss);
        for(int i=0;i<s.length()-p.length()+1;i++){
            char[] pp=s.substring(i,i+p.length()).toCharArray();
            Arrays.sort(pp);
            if(Arrays.equals(ss, pp)) arr.add(i);
        }
        return arr;
    }
}