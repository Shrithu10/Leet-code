class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<word1.length();i++){
            hm.put(word1.charAt(i),hm.getOrDefault(word1.charAt(i),0)+1);
        }
        
        for(int j=0;j<word2.length();j++){
            hm.put(word2.charAt(j),hm.getOrDefault(word2.charAt(j),0)-1);
        }
        int[] arr= hm.values().stream().mapToInt(Integer::intValue).toArray();
        for(int k=0;k<arr.length;k++){
            if(Math.abs(arr[k]) > 3) return false;
        }   
        return true; 
    }
}