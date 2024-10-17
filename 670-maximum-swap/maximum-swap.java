class Solution {
    public int maximumSwap(int num) {
        char[] arr = Integer.toString(num).toCharArray();
        char[] arr2 = Integer.toString(num).toCharArray();
        Arrays.sort(arr2);
         for(int i = 0, j = arr2.length - 1; i < j; i++, j--) {
            char temp = arr2[i];
            arr2[i] = arr2[j];
            arr2[j] = temp;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i] != arr2[i]){
            for(int j=arr.length-1;j>i;j--){
               if(arr[j]==arr2[i]){
                char temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                return Integer.parseInt(new String(arr));
               } 
            }
            }
            
        }
        return num;
    }
}