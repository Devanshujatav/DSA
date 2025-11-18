package org.devanshu.Programs.Sliding_Window_Maximum;

import java.util.Stack;

public class SlidingWindowMaximum {
    /**
     * Sliding Window Maximum using only Stack
     * Uses a stack to store indices in decreasing order of their values
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     *
     * @param nums Array of integers
     * @param k Size of sliding window
     * @return Array of maximum values for each window
     */
    public static int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k <= 0) {
            return new int[0];
        }

        int n = nums.length;
        int[] result = new int[n - k + 1];

        // Stack stores indices in decreasing order of values
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            // Remove indices outside current window from bottom of stack
            if (!stack.isEmpty() && stack.get(0) < i - k + 1) {
                stack.remove(0); // Remove from bottom
            }

            // Remove indices with smaller values from top
            while (!stack.isEmpty() && nums[stack.peek()] < nums[i]) {
                stack.pop();
            }

            // Add current index
            stack.push(i);

            // Record maximum (bottom of stack has the maximum)
            if (i >= k - 1) {
                result[i - k + 1] = nums[stack.get(0)];
            }
        }

        return result;
    }

    /**
     * Alternative: Using two stacks with max tracking
     * Simulates a queue using two stacks
     * Time Complexity: O(n) amortized
     * Space Complexity: O(k)
     */
    public static int[] maxSlidingWindowTwoStacks(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k <= 0) {
            return new int[0];
        }

        int n = nums.length;
        int[] result = new int[n - k + 1];

        // Stack stores [value, max_below_including_this]
        Stack<int[]> pushStack = new Stack<>();
        Stack<int[]> popStack = new Stack<>();

        // Add first k elements
        for (int i = 0; i < k; i++) {
            int maxVal = pushStack.isEmpty() ? nums[i] : Math.max(pushStack.peek()[1], nums[i]);
            pushStack.push(new int[]{nums[i], maxVal});
        }

        // Get max of first window
        result[0] = getMaxFromStacks(pushStack, popStack);

        // Slide the window
        for (int i = k; i < n; i++) {
            // Remove oldest element
            removeElement(pushStack, popStack);

            // Add new element
            int maxVal = pushStack.isEmpty() ? nums[i] : Math.max(pushStack.peek()[1], nums[i]);
            pushStack.push(new int[]{nums[i], maxVal});

            // Get max of current window
            result[i - k + 1] = getMaxFromStacks(pushStack, popStack);
        }

        return result;
    }

    // Helper: Get maximum from both stacks
    private static int getMaxFromStacks(Stack<int[]> pushStack, Stack<int[]> popStack) {
        int max = Integer.MIN_VALUE;

        if (!pushStack.isEmpty()) {
            max = Math.max(max, pushStack.peek()[1]);
        }
        if (!popStack.isEmpty()) {
            max = Math.max(max, popStack.peek()[1]);
        }

        return max;
    }

    // Helper: Remove oldest element from queue simulation
    private static void removeElement(Stack<int[]> pushStack, Stack<int[]> popStack) {
        // If popStack is empty, move all from pushStack
        if (popStack.isEmpty()) {
            while (!pushStack.isEmpty()) {
                int val = pushStack.pop()[0];
                int maxVal = popStack.isEmpty() ? val : Math.max(popStack.peek()[1], val);
                popStack.push(new int[]{val, maxVal});
            }
        }

        // Remove from popStack
        if (!popStack.isEmpty()) {
            popStack.pop();
        }
    }

    /**
     * Pure Stack approach with auxiliary stack for window tracking
     * Time Complexity: O(n)
     * Space Complexity: O(k)
     */
    public static int[] maxSlidingWindowAuxStack(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k <= 0) {
            return new int[0];
        }

        int n = nums.length;
        int[] result = new int[n - k + 1];

        // Main stack stores indices
        Stack<Integer> mainStack = new Stack<>();

        for (int i = 0; i < n; i++) {
            // Create auxiliary stack to filter elements
            Stack<Integer> auxStack = new Stack<>();

            // Remove elements outside window and smaller elements
            while (!mainStack.isEmpty()) {
                int idx = mainStack.pop();

                // Keep if in window and greater than or equal to current
                if (idx >= i - k + 1 && nums[idx] >= nums[i]) {
                    auxStack.push(idx);
                } else if (idx >= i - k + 1) {
                    // In window but smaller, don't keep
                    continue;
                }
                // Outside window, don't keep
            }

            // Restore elements to main stack (in reverse order)
            while (!auxStack.isEmpty()) {
                mainStack.push(auxStack.pop());
            }

            // Add current element
            mainStack.push(i);

            // Find maximum in current window
            if (i >= k - 1) {
                int max = Integer.MIN_VALUE;
                auxStack = new Stack<>();

                // Collect all elements and find max
                while (!mainStack.isEmpty()) {
                    int idx = mainStack.pop();
                    max = Math.max(max, nums[idx]);
                    auxStack.push(idx);
                }

                // Restore stack
                while (!auxStack.isEmpty()) {
                    mainStack.push(auxStack.pop());
                }

                result[i - k + 1] = max;
            }
        }

        return result;
    }
}
