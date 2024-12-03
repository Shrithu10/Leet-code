class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder result = new StringBuilder();
        int p=0;
        for(int j=0;j<spaces.length;j++){
        
        for(int i=p;i<s.length();i++){
            if(spaces[j]==i){
                result.append(' '); 
                p=i;
                break;
            }
            result.append(s.charAt(i));
        }
    }
    for(int i=p;i<s.length();i++){
        result.append(s.charAt(i));
    }
    String f= result.toString();
    return f;}
}