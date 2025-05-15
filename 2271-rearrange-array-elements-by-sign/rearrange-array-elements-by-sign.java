class Solution {
    public int[] rearrangeArray(int[] nums) {

        int n=nums.length;
        int positive[]=new int[n/2];
        int negative[]=new int[n/2];
        int posindex=0;
        int negindex=0;
        int resindex=0;
        int result[]=new int[n];

        for(int i =0;i<nums.length;i++){

            if(nums[i]>0){
                positive[posindex++]=nums[i];
            }
            else{
                negative[negindex++]=nums[i];
            }
        }
        for(int i=0;i<n/2;i++){
            if (i < positive.length) result[resindex++]=(positive[i]);
            if (i < negative.length) result[resindex++]=(negative[i]);
        }

        return result;
        
    }
}