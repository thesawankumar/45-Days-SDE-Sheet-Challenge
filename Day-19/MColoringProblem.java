class Solution {

    boolean isSafe(int node, int color, int[] colors, List<Integer>[] graph) {
        for (int nei : graph[node]) {
            if (colors[nei] == color) return false;
        }
        return true;
    }

    boolean dfs(int node, int[] colors, List<Integer>[] graph, int m) {
        if (node == graph.length) return true;

        for (int color = 1; color <= m; color++) {
            if (isSafe(node, color, colors, graph)) {
                colors[node] = color;

                if (dfs(node + 1, colors, graph, m)) return true;

                colors[node] = 0;
            }
        }
        return false;
    }

    boolean graphColoring(int v, int[][] edges, int m) {
        List<Integer>[] graph = new ArrayList[v];
        for (int i = 0; i < v; i++) graph[i] = new ArrayList<>();

        for (int[] e : edges) {
            graph[e[0]].add(e[1]);
            graph[e[1]].add(e[0]);
        }

        return dfs(0, new int[v], graph, m);
    }
}