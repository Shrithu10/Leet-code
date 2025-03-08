class Solution {
    public boolean isLongPressedName(String name, String typed) {
     int p1=0;
     int p2=0;

     while(p1<name.length() && p2<typed.length()){
            int c1=0;
            int c2=0;
            char ch=name.charAt(p1);
        while(p1<name.length() && name.charAt(p1)==ch){
                p1++;
                c1++;
            }
        while(p2<typed.length() && typed.charAt(p2)==ch){
                p2++;
                c2++;
        }
        if(c1>c2) return false;
    } return p1 == name.length() && p2 == typed.length(); 
    }
}