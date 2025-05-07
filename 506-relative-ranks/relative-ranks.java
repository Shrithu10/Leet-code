class Solution {
    public String[] findRelativeRanks(int[] score) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        Integer[] s=Arrays.stream(score).boxed().toArray(Integer[]::new);
        Arrays.sort(s,Collections.reverseOrder());
        String[] arr=new String[score.length];
        for(int i=0;i<score.length;i++){
            arr[i]=String.valueOf(Arrays.asList(s).indexOf(score[i])+1);
            if(arr[i].equals("1")) arr[i]="Gold Medal";
            if(arr[i].equals("2")) arr[i]="Silver Medal";
            if(arr[i].equals("3")) arr[i]="Bronze Medal";
        }
        return arr;
    }
}