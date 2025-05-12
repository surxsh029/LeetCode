class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int[] res = new int[m + n];

        int a = 0;
        for (int i = 0; i < (m + n); i++) {
            if (nums1[i] == 0) {
                continue;
            }
            res[a] = nums1[i];
            a++;
        }
        for (int i = 0; i < n; i++) {
            if (nums2[i] == 0) {
                continue;
            }
            res[a] = nums2[i];
            a++;
        }

        Arrays.sort(res);
       for(int i=0;i<(m+n);i++){
        nums1[i]=res[i];
       }
    }
}