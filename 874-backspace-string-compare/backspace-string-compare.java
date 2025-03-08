class Solution {
    public boolean backspaceCompare(String s, String t) {
        int p1=0;
        int p2=0;
        Stack<Character> ss= new Stack<>();
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='#'){
                ss.push(s.charAt(i));
            }
            else if (!ss.isEmpty()) ss.pop();
        }
        for(int j=0;j<t.length();j++){
            if(t.charAt(j)!='#'){
                st.push(t.charAt(j));
            }
            else if (!st.isEmpty())st.pop();
        }
        StringBuilder sb1 = new StringBuilder();
        while (!ss.isEmpty()) {
            sb1.append(ss.pop());
        }
        StringBuilder sb2 = new StringBuilder();
        while (!st.isEmpty()) {
            sb2.append(st.pop());
        }
        return sb1.toString().equals(sb2.toString());
        
    }
}