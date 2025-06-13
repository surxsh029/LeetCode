class Solution {
    public int maxArea(int[] height) {

        int max=0;
        int curr=0;
        int min=Integer.MIN_VALUE;
        int width=0;
       int lp=0;
       int rp=height.length-1;

       while(lp<rp){
        min=Math.min(height[rp],height[lp]);
        width=rp-lp;
        curr=min*width;
        if(curr>max) max=curr;

        if(height[rp]>height[lp]) lp++;
        else rp--;
       }
        return max;
    }
}