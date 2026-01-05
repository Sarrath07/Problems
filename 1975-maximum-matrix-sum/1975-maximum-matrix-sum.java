class Solution {
    public long maxMatrixSum(int[][] matrix) {
       long sum =0;
       int c  = 0;
       int min = Integer.MAX_VALUE;
       int n = matrix.length;
       int m = matrix[0].length;

       for(int i = 0; i<n; i++){
        for(int j = 0; j<m; j++){
            sum +=Math.abs(matrix[i][j]);
            if(matrix[i][j]<0) c++;
            min = Math.min(min, Math.abs(matrix[i][j]));
        }
       } 
       if(c%2==1) sum -= 2 * min;
       return sum;
    }
}