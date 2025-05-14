class Solution {
    public int maxSubArray(int[] nums) {
     int currSum=nums[0];// start with the first element
       int maxSum=nums[0];// intialize maxsum to handle all negative cases

       for(int i=1;i<nums.length;i++){
       

        currSum=Math.max(nums[i],currSum+nums[i]);
        maxSum=Math.max(currSum, maxSum);
       }
       return maxSum;
    }
}