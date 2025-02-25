class Search2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        if( matrix == null || matrix.length == 0) return false;

        int m = matrix.length; // number of rows
        int n = matrix[0].length; // number of columns
        int low = 0 ,high = m*n-1;
        
        while(low<=high){
            int mid = low+(high-low)/2;
            int r = mid/n;
            int c = mid%n;
            if(matrix[r][c]==target) return true;
            else if(matrix[r][c]>target) high = mid-1;
            else low = mid+1;
        }
        return false;
    }
}

// Time complexity - O(log(mn))
// Space Complexity - O(1) - Constant time - No extra space used