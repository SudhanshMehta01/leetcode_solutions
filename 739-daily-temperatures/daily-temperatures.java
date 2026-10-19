class Solution {
    public int[] dailyTemperatures(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {

            // Jab current temperature stack ke top wale day se zyada hai
            while (!stack.isEmpty() && arr[i] > arr[stack.peek()]) {

                int prev = stack.pop();

                // Kitne din baad warmer temperature mila
                ans[prev] = i - prev;
            }

            // Current day ka index stack mein store karo
            stack.push(i);
        }

        return ans;
    }
}