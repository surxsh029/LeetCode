class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
       int n =nums2.length;
       int nextG[]=new int[n];
       Stack<Integer>s=new Stack<>();

       for(int i=n-1;i>=0;i--){
        while(!s.isEmpty()&& nums2[s.peek()]<=nums2[i]){
            s.pop();
        }
        if(s.isEmpty()){
            nextG[i]=-1;
        }else{
            nextG[i]=nums2[s.peek()];
        }
        s.push(i);
       }

       int result[]=new int [nums1.length];

       for(int i=0;i<nums1.length;i++){
        for(int j=0;j<n;j++){
            if(nums1[i]==nums2[j]){
                result[i]=nextG[j];
                break;
            }
        }
       }
       return result;
    }
}
