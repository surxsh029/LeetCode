class Solution {
    public int findKthLargest(int[] nums, int k) {
        // Arrays.sort(nums);

        // int result=nums[nums.length-k];

        // return result;

        PriorityQueue<Integer>minheap=new PriorityQueue<>();

        for(int num : nums){
            minheap.add(num);
            if(minheap.size()>k){
                minheap.poll();
            }
        }

        return minheap.peek();
        
    }
}