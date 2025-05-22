class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int left=1;
        int right=Arrays.stream(piles).max().getAsInt();

        while(right>left){
            int mid=left+(right-left)/2;
            int sum=0;
            for(int num : piles ){
                sum+=Math.ceil((double)num/mid);
            }
            if(sum>h){
                left=mid+1;
            }
            else{
                right=mid;
            }
        }        
        return left;
    }
}