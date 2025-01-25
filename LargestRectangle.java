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

### **Example**
#### Input:
```java
List<Integer> h = Arrays.asList(2, 1, 5, 6, 2, 3);
System.out.println(largestRectangle(h));
```

#### Execution:
1. Initialize `stack = []` and `maxArea = 0`.
2. Start iterating through the heights:
   - **i = 0:** Push `0` (index of height `2`). Stack: `[0]`
   - **i = 1:** Height `1` is less than height at index `0` (`2`), so:
     - Pop `0`, calculate area: `2 * 1 = 2`. Update `maxArea = 2`.
     - Push `1`. Stack: `[1]`
   - **i = 2:** Push `2` (index of height `5`). Stack: `[1, 2]`
   - **i = 3:** Push `3` (index of height `6`). Stack: `[1, 2, 3]`
   - **i = 4:** Height `2` is less than height at index `3` (`6`), so:
     - Pop `3`, calculate area: `6 * 1 = 6`. Update `maxArea = 6`.
     - Pop `2`, calculate area: `5 * 2 = 10`. Update `maxArea = 10`.
     - Push `4`. Stack: `[1, 4]`
   - **i = 5:** Push `5` (index of height `3`). Stack: `[1, 4, 5]`
   - **i = 6:** Process remaining indices with height `0`:
     - Pop `5`, calculate area: `3 * 1 = 3`. `maxArea = 10`.
     - Pop `4`, calculate area: `2 * 4 = 8`. `maxArea = 10`.
     - Pop `1`, calculate area: `1 * 6 = 6`. `maxArea = 10`.

3. Final `maxArea = 10`.
