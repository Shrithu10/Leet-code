class Solution {
    public boolean checkInclusion(String s1, String s2) {
      char[] a=s1.toCharArray();
      Arrays.sort(a);
      for(int i=0;i<=s2.length()-s1.length();i++){
        char[] b=s2.substring(i,i+s1.length()).toCharArray();
        Arrays.sort(b);
        if(Arrays.equals(a,b)) return true;
      }
      return false;  
    }
}