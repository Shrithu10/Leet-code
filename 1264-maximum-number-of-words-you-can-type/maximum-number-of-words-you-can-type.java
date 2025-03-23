class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] s = text.split(" ");
        int c=0;
        for(String i:s)
        {
            boolean b=true;
            for(int j=0;j<brokenLetters.length();j++)
            {
                if(i.contains(String.valueOf(brokenLetters.charAt(j))))
                {
                    b=false;
                    break;
                }
            }
            if(b)c++;
        }
        return c;
    }
}