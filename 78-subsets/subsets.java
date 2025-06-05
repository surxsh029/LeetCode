class Solution {

      public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        generate(nums, 0, new ArrayList<>(), result);
        return result;
    }
    private void generate (int[] nums,int i,List<Integer>current,List<List<Integer>> result) {

        if(i==nums.length){
            result.add(new ArrayList<>(current));
            return;
        }
        // yes wali choice
        current.add(nums[i]);
        generate(nums,i+1,current,result);
        // no wali choice
        current.remove(current.size() - 1);
        generate(nums, i + 1, current, result);
    }
}