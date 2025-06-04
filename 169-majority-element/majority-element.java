class Solution {
    public int majorityElement(int[] nums) {

        Arrays.sort(nums);

        int count=1;
        int max=0;
        int result=0;
        int i;

        for(i=0;i<nums.length-1;i++){
            
            if(nums[i]==nums[i+1]){
                count++;
               continue;
            }
            if(count >max){
                max=count;
                count=1;
                result=nums[i];
            }
        }
        if(count>max) return nums[i];
        return  result;        
    }
}