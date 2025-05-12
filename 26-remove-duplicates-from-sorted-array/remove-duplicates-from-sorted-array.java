class Solution {
    public int removeDuplicates(int[] nums) {

        int j=0;
        int count=0;

        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[j]){
                j++;
                nums[j]=nums[i];
            }
        }
        for(int i=0;i<=j;i++){
            count++;
        }
        return count;
    }
}