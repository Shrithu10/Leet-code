class Solution {
    public int numberOfAlternatingGroups(int[] colors) {
        int[] arr=new int[colors.length+2];
        for(int i=0;i<colors.length;i++){
            arr[i]=colors[i];
        }
        arr[colors.length+1]=colors[1];
        arr[colors.length]=colors[0];
        int p1=0;
        int p2=2;
        int c=0;
        while(p2<arr.length){
            int m=p1+(p2-p1)/2;
            if(arr[p1]==arr[p2] && arr[p1]!=arr[m] && arr[p2]!=arr[m]){
                c=c+1;
            }
            p1++;
            p2++;
        }
    return c;
    }
}