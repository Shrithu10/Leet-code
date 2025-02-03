class Solution {
    public int partitionString(String s) {
        int c=1;
        ArrayList<Character> arr=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(!arr.contains(s.charAt(i))){
                arr.add(s.charAt(i));
            }
            else{
                System.out.println(arr);
                
                arr.clear();
                arr.add(s.charAt(i));
                c++;
            }

        }
        return c;
    }
}