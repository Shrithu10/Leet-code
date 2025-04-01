class Solution {
    public int similarPairs(String[] words) {
        int co=0;
        for(int i=0;i<words.length;i++){
            for(int j=i+1;j<words.length;j++){
                Set<Character> set1 = new HashSet<>();
                Set<Character> set2 = new HashSet<>();
                
                for (char c : words[i].toCharArray()) set1.add(c);
                for (char c : words[j].toCharArray()) set2.add(c);
                if(set1.equals(set2)) co++;
            }
        }
        return co;
    }
}