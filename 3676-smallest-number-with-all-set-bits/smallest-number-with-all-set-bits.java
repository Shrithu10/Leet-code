class Solution {
    public int smallestNumber(int n) {
        while(n<Integer.MAX_VALUE){
            String b=Integer.toBinaryString(n);
            String str = "1".repeat(b.length());
            if(b.equals(str)) return n;
            n++;
        }
    return -1;
    }
}