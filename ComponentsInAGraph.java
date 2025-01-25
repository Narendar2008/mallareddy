public static List<Integer> componentsInGraph(List<List<Integer>> gb) {
    // Write your code here
        // Number of nodes can go up to 2 * gb.size()
        int n = gb.size() * 2;
        
        // Union-Find structures
        int[] parent = new int[n + 1];
        int[] size = new int[n + 1];
        
        // Initialize Union-Find
        for (int i = 1; i <= n; i++) {
            parent[i] = i;
            size[i] = 1;
        }
        
        // Process all edges
        for (List<Integer> edge : gb) {
            int u = edge.get(0);
            int v = edge.get(1);
            union(u, v, parent, size);
        }
        
        // Find smallest and largest components
        int minSize = Integer.MAX_VALUE;
        int maxSize = Integer.MIN_VALUE;
        
        // Track visited roots
        Set<Integer> visited = new HashSet<>();
        
        for (int i = 1; i <= n; i++) {
            int root = find(i, parent);
            if (!visited.contains(root)) {
                visited.add(root);
                if (size[root] > 1) { // Ignore single nodes
                    minSize = Math.min(minSize, size[root]);
                    maxSize = Math.max(maxSize, size[root]);
                }
            }
        }
        
        return Arrays.asList(minSize, maxSize);
    }

    // Find with path compression
    private static int find(int x, int[] parent) {
        if (parent[x] != x) {
            parent[x] = find(parent[x], parent);
        }
        return parent[x];
    }

    // Union by size
    private static void union(int x, int y, int[] parent, int[] size) {
        int rootX = find(x, parent);
        int rootY = find(y, parent);
        
        if (rootX != rootY) {
            if (size[rootX] < size[rootY]) {
                parent[rootX] = rootY;
                size[rootY] += size[rootX];
            } else {
                parent[rootY] = rootX;
                size[rootX] += size[rootY];
            }
        }

    }

}
