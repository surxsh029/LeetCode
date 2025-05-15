class Solution {
    public int subarraySum(int[] nums, int k) {

        int count =0;

        for(int i=0;i<nums.length;i++){
            int sum=0;
            for(int end=i;end<nums.length;end++){
                sum+=nums[end];
                if(sum==k){
                    count++;
                }

            }
           
        }
        return count;
        
    }
}