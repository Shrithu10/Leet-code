class Solution {
    public String kthDistinct(String[] arr, int k) {
        List<String> a=new ArrayList<String>();
       for(int i=0;i<arr.length;i++){
        int c=0;
        for(int j=0;j<arr.length;j++){
            if (arr[i].equals(arr[j])){
                c=c+1;
            }
        }
        if(c==1){
            a.add(arr[i]);
        }
        


    }

         if (k - 1 < a.size()) {
            return a.get(k - 1);
        } else {
            return "";
        } 
}}