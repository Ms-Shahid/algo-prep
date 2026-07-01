class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];

        result[n - 1] = -1;

        int largestSoFar = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > largestSoFar) {
                result[i] = largestSoFar;
                largestSoFar = arr[i];
            } else {
                result[i] = largestSoFar;
            }
        }

        return result;
    }
}