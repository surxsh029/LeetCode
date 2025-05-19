class Solution {
    public int[] searchRange(int[] nums, int target) {

        int res[] = { -1, -1 };

        int n = nums.length;
        int start = 0;
        int end = n - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (nums[mid] < target) {
                start = mid + 1;
            } else if (nums[mid] > target) {
                end = mid - 1;
            }
            if (nums[mid] == target) {
                res[0] = mid;
                end = mid - 1;
            }

        }
        start = 0;
        end = n - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] < target) {
                start = mid + 1;
            }
            else if (nums[mid] > target) {
                end = mid - 1;
            }
            if (nums[mid] == target) {
                res[1] = mid;
                start = mid + 1;

            }
        }
        return res;

    }
}