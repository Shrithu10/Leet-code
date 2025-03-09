class Solution {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill); 
        int l=0;
        int r=skill.length-1;
        long sum=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        while(l<=r){
            int x=skill[l]+skill[r];
            hm.put(x,hm.getOrDefault(x,0)+1);
            if(hm.size()>1) return -1;
            sum=sum+(skill[l]*skill[r]);
            l++;
            r--;
        }
        return sum;
    }
}