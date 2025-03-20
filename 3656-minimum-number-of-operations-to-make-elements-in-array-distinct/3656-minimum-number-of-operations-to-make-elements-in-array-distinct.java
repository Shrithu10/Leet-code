class Solution {
    public int minimumOperations(int[] nums) {
        int l=0;
        int c=0;
        while(l<nums.length-1){
            
            
            if(!check(nums,l)) {c++; l=l+3;}
            else{break;}
        }
        return c;
    }

    public static boolean check(int[] arr,int l){
        HashSet<Integer> s=new HashSet<>();
        for(int i=l;i<arr.length;i++){
            if(s.contains(arr[i])) return false;
            s.add(arr[i]);
        }
        return true;
    }
}