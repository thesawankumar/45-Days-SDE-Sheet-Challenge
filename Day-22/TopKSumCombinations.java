import java.util.*;

class Solution {
    public ArrayList<Integer> topKSumPairs(int[] a, int[] b, int k) {

        int n = a.length;
        Arrays.sort(a);
        Arrays.sort(b);

        PriorityQueue<int[]> pq =
                new PriorityQueue<>((x, y) -> y[0] - x[0]);

        HashSet<String> set = new HashSet<>();

        pq.offer(new int[]{a[n-1] + b[n-1], n-1, n-1});
        set.add((n-1) + "," + (n-1));

        ArrayList<Integer> ans = new ArrayList<>();

        while (k-- > 0) {
            int[] cur = pq.poll();

            int sum = cur[0];
            int i = cur[1];
            int j = cur[2];

            ans.add(sum);

            if (i > 0 && set.add((i-1) + "," + j))
                pq.offer(new int[]{a[i-1] + b[j], i-1, j});

            if (j > 0 && set.add(i + "," + (j-1)))
                pq.offer(new int[]{a[i] + b[j-1], i, j-1});
        }

        return ans;
    }
}