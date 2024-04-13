class Solution {
    public int maximalRectangle(char[][] matrix) {
        if (matrix == null || matrix.length == 0) return 0;

        int max = 0;
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[] heights = new int[cols]; // heights array to represent the height of each column

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // Update the heights array
                heights[j] = (matrix[i][j] == '1') ? heights[j] + 1 : 0;
            }
            // Calculate the maximal area histogram for the current row
            max = Math.max(max, largestRectangleArea(heights));
        }

        return max;
    }

    private int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        int i = 0;
        while (i < heights.length) {
            if (stack.isEmpty() || heights[i] >= heights[stack.peek()]) {
                stack.push(i++);
            } else {
                int top = stack.pop();
                maxArea = Math.max(maxArea, heights[top] * (stack.isEmpty() ? i : i - stack.peek() - 1));
            }
        }
        while (!stack.isEmpty()) {
            int top = stack.pop();
            maxArea = Math.max(maxArea, heights[top] * (stack.isEmpty() ? i : i - stack.peek() - 1));
        }
        return maxArea;
    }
}
