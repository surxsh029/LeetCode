class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {

        int n =grid.length*grid[0].length;

        int count[]=new int[n+1];

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                count[grid[i][j]]++;
            }
        }

        int res[]=new int[2];
        for(int i =1;i<=n;i++){
            if(count[i]==2) res[0]=i;
            if(count[i]==0) res[1]=i;
        }
        return res;
    }
}