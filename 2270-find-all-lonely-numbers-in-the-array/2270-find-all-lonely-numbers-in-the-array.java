class Solution {
    public List<Integer> findLonely(int[] nums) {

        Arrays.sort(nums);

        ArrayList<Integer>ans=new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            int curr=nums[i];
            boolean isLonely=true;

            if((i>0 && nums[i-1]==curr) || (i<nums.length-1 && nums[i+1]==curr) ) isLonely=false;

            if((i>0 && nums[i-1]==curr-1) || (i<nums.length-1 && nums[i+1]==curr+1)) isLonely=false;

            if(isLonely){
                ans.add(curr);
            } 
        }

        return ans;
        
    }
}