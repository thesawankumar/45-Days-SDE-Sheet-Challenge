import java.util.*;

class Solution {
    public int longestSubarray(int[] arr, int k) {

        HashMap<Integer, Integer> hash = new HashMap<>();

        int sum = 0;
        int maxLen = 0;

        for (int i = 0; i < arr.length; i++) {

            sum += arr[i];

            if (sum == k) {
                maxLen = Math.max(maxLen, i + 1);
            }

            if (hash.containsKey(sum - k)) {
                maxLen = Math.max(maxLen, i - hash.get(sum - k));
            }

            if (!hash.containsKey(sum)) {
                hash.put(sum, i);
            }
        }

        return maxLen;
    }
}