class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        int i=0;
        int j=9;
        ArrayList<String> arr=new ArrayList<>();
        HashMap<String,Integer> hm=new HashMap<>();
        while(j<s.length()){
            hm.put(s.substring(i,j+1),hm.getOrDefault(s.substring(i,j+1),0)+1);
            i++;
            j++;
        }
        for(Map.Entry<String,Integer> entry:hm.entrySet()){
            if(entry.getValue()>1) arr.add(entry.getKey());
        }
        return arr;
    }
}