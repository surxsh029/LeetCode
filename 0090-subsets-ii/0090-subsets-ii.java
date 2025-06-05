class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>>result=new ArrayList<>();
        Arrays.sort(nums);
        generate( nums,0,new ArrayList<>(),result);
        return result;
    }
    public void generate(int nums[],int i,List<Integer>current,List<List<Integer>>result){
       result.add(new ArrayList<>(current));

        for (int j = i; j < nums.length; j++) {
            // Skip duplicates
            if (j > i && nums[j] == nums[j - 1]) continue;

            current.add(nums[j]);
            generate(nums, j + 1, current, result);
            current.remove(current.size() - 1);
    }
}
}