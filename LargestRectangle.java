public static long largestRectangle(List<Integer> h) {
    Stack<Integer> stack = new Stack<>();
    long maxArea = 0;
    int n = h.size();

    for (int i = 0; i <= n; i++) {
        // Use 0 for the height at the end to process all remaining bars
        int currentHeight = (i == n) ? 0 : h.get(i);

        while (!stack.isEmpty() && h.get(stack.peek()) > currentHeight) {
            int topIndex = stack.pop();
            long height = h.get(topIndex);
            long width = stack.isEmpty() ? i : i - stack.peek() - 1;
            maxArea = Math.max(maxArea, height * width);
        }

        stack.push(i);
    }

    return maxArea;
}
