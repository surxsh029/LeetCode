class Solution {
    public int mostFrequent(int[] nums, int key) {
        int[] result = new int[1001];  // Slightly bigger size to avoid edge issues

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == key) {
                int next = nums[i + 1];
                if (next >= 0 && next < result.length) {
                    result[next]++;
                }
            }
        }

        int max = 0;
        int ans = 0;

        for (int i = 0; i < result.length; i++) {
            if (result[i] > max) {
                max = result[i];
                ans = i;
            }
        }

        return ans;
    }
}
