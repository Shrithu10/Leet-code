import java.util.Arrays;

class Solution {
    public boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] == 2 * arr[i]) {
                        return true;
                    }
                }
            }
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] < 0) {
                for (int j = i - 1; j >= 0; j--) {
                    if (arr[j] == 2 * arr[i]) {
                        return true;
                    }
                }
            }
        }

        return false;
    }
}
