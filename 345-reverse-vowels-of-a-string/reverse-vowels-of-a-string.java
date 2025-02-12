class Solution {
    public String reverseVowels(String s) {
        int l=0;
        int r=s.length()-1;
        StringBuilder sb=new StringBuilder(s);

        while(l<=r){
            if(isVowel(sb.charAt(l)) && isVowel(sb.charAt(r)) ){
                char temp = sb.charAt(l);
                sb.setCharAt(l, sb.charAt(r));
                sb.setCharAt(r, temp);   
                l++;
                r--;
            }
            else if(isVowel(sb.charAt(l)) && !isVowel(sb.charAt(r))  ){
                r--;
            }
            else if(!isVowel(sb.charAt(l)) && isVowel(sb.charAt(r)) ){
                l++;
            }            
            else if(!isVowel(sb.charAt(l) )&& !isVowel(sb.charAt(r)) ){
                l++;
                r--;
            }
        }
        return sb.toString();
    }
    static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

}