class Solution {
    public void sortColors(int[] nums) {

        // Arrays.sort(nums);

        // System.out.println(nums);

        int largest=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){

            largest=Math.max(largest,nums[i]);
        }

        int count []= new int[largest+1];

        for(int i=0;i<nums.length;i++){
            count[nums[i]]++;
        }

        int j=0;

        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                nums[j]=i;
                j++;
                count[i]--;
                 System.out.println(nums[j-1]);

            }
        }

       
        
    }
}