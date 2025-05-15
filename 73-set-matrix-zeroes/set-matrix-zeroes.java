class Solution {
    public void setZeroes(int[][] matrix) {

        int r=matrix.length;
        int c=matrix[0].length;
        int m=0;
        int arr[][]=new int [r*c][2];

        for(int i =0;i<r;i++){
            for(int j=0;j<c;j++){

                if(matrix[i][j]==0){
                    arr[m][0]=i;
                    arr[m][1]=j;
                    m++;
                }
            }
        }    

        for(int i=0;i<m;i++){
            set(matrix,r,c,arr[i][0],arr[i][1]);
        }    
    }

        public static void set(int arr[][],int r,int c, int m,int n){
            for(int i=0;i<r;i++){
                arr[i][n]=0;
            }
            for(int i =0;i<c;i++){
                arr[m][i]=0;
            }
        
    }
}