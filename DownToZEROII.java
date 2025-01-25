 public static int downToZero(int n) {
    // Write your code here
        // Special case: n is already 0
        if (n == 0) return 0;

        // Queue for BFS
        Queue<int[]> queue = new LinkedList<>();
        // Set to track visited numbers
        boolean[] visited = new boolean[n + 1];

        // Start BFS from n with 0 steps
        queue.add(new int[]{n, 0});
        visited[n] = true;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int num = current[0];
            int steps = current[1];

            // If we reach 0, return the steps
            if (num == 0) return steps;

            // Option 1: Subtract 1
            if (!visited[num - 1]) {
                visited[num - 1] = true;
                queue.add(new int[]{num - 1, steps + 1});
            }

            // Option 2: Replace with factors smaller than num
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    int factor = Math.max(i, num / i);
                    if (factor < num && !visited[factor]) {
                        visited[factor] = true;
                        queue.add(new int[]{factor, steps + 1});
                    }
                }
            }
        }

        // Edge case (should never happen)
        return -1;
    }
