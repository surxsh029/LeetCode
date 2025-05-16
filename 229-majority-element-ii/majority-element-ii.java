class Solution {
    public List<Integer> majorityElement(int[] nums) {

        Arrays.sort(nums);

        ArrayList<Integer> numbers = new ArrayList<>();

        int count = 1;
        for (int i = 1; i < nums.length; i++) {

            if (nums[i] == nums[i - 1]) {
                count++;

            } else {
                if (count > nums.length / 3) {
                    numbers.add(nums[i - 1]);
                }
                count = 1;
            }

        }
        if (count > nums.length / 3) {
            numbers.add(nums[nums.length - 1]);
        }
        return numbers;
    }
}