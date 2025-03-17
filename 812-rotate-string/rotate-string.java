class Solution {
    public boolean rotateString(String s, String goal) {
        StringBuilder sb=new StringBuilder();
        sb.append(goal);
        for(int i=0;i<goal.length();i++){
            char c=sb.charAt(0);
            
            sb.deleteCharAt(0);
            sb.append(c);
    if(sb.toString().equals(s)) return true;

        }
        return false;

    }
}