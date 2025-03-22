class Solution {
    public String decodeMessage(String key, String message) {
        Map<Character,Character> m = new HashMap<>();
        char c='a';
        for(int i=0;i<key.length();i++)
        {
            if(key.charAt(i)!=' ' && !m.containsKey(key.charAt(i)))m.put(key.charAt(i),c++);
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<message.length();i++)
        {
            if(m.containsKey(message.charAt(i)))sb.append(m.get(message.charAt(i)));
            else sb.append(message.charAt(i));
        }
        return sb.toString();
    }
}