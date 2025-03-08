class Solution {
    public String reverseStr(String s, int k) {
        char[] c=s.toCharArray();
        for(int i=0;i<s.length();i=i+2*k){
            int left=i;
            int right=Math.min(i+k-1,s.length()-1);
            while(left<=right){
                char t=c[left];
                c[left]=c[right];
                c[right]=t;
                left++;
                right--;
            }
        }
        return new String(c);
    }
}