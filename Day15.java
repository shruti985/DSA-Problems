//Problem:Search a 2D matrix 2
//https://leetcode.com/problems/search-a-2d-matrix-ii/
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=0,col=matrix[0].length-1;
        while(row<matrix.length && col>=0){
            if(matrix[row][col]==target)
            return true;
            else if(matrix[row][col]>target)
            col--;
            else
            row++;
        }
      return false;
    }
}
//TC:O(m+n)
//SC:O(1)

//Problem:Search a 2D matrix
//https://leetcode.com/problems/search-a-2d-matrix/description/
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;
        int start = 0;
        int end = row * col - 1;

        while (start <= end) {
           int mid = start + (end - start) / 2;
           if (matrix[mid / col][mid % col] == target)
                return true;
         else if (matrix[mid / col][mid % col] < target)
                start = mid + 1;
        else
                end = mid - 1;
        }
        return false;
    }
}
//TC:O(logmn)
//SC:O(1)
