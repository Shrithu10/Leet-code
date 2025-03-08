class Solution {
    public void duplicateZeros(int[] arr) {
        int c = 0, n = arr.length - 1;
        for (int i = 0; i <= n - c; i++) {
            if (arr[i] == 0) {
                if (i == n - c) {
                    arr[n] = 0;
                    n--;
                    break;
                }
                c++;
            }
        }
        int last = n - c;
        for (int j = last; j >= 0; j--) {
            if (arr[j] == 0) {
                arr[j + c] = 0;
                c--;
                arr[j + c] = 0;
            } else {
                arr[j + c] = arr[j];
            }
        }
    }
}
