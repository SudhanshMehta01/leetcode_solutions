class NumArray {
    int[] prefix;

    public NumArray(int[] nums) {
        int n = nums.length;
        prefix = new int[n + 1];

        // Prefix sum calculate karo
        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + nums[i];
        }
    }

    public int sumRange(int left, int right) {
        // Range sum = right tak ka sum - left se pehle ka sum
        return prefix[right + 1] - prefix[left];
    }
}