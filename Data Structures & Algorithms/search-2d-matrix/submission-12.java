class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int top = 0;
        int bottom = matrix.length - 1;

        while (top <= bottom) {
            int middle = (top + bottom) / 2;
            if (matrix[middle][0] < target) {
                if (middle == matrix.length - 1 || matrix[middle + 1][0] > target) {
                    // the solution (if exists) must be in this row
                    int left = 0;
                    int right = matrix[middle].length - 1;
                    
                    while (left <= right) {
                        int middle2 = (left + right) / 2;
                        if (matrix[middle][middle2] < target) {
                            left = middle2 + 1;
                        } else if (matrix[middle][middle2] > target) {
                            right = middle2 - 1;
                        } else {
                            return true;
                        }
                    }
                }
                top = middle + 1;
            } else if (matrix[middle][0] > target) {
                bottom = middle - 1;
            } else {
                return true;
            }
        }
        return false;
    }
}
