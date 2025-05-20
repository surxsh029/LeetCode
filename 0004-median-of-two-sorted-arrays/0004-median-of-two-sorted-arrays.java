class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2){

    int n =nums1.length;
    int m = nums2.length;;

    int [] merged= new int[n+m];

    for(int i =0;i<n;i++){
        merged[i]=nums1[i];
    }
    for(int i =0;i<m;i++){
        merged[n+i]=nums2[i];
    }

    Arrays.sort(merged);

    int k=merged.length;

    for(int i=0;i<k;i++){
        double median=0;
        if(k%2==0){
            median=((merged[(k/2) -1])+(merged[k/2]))/2.0;

            return median;
        }
        else{
            median = merged[k/2];
            return median;
        }
    }

    return 0;
        
    }
}