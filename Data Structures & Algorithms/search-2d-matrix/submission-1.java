class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int s = 0;
        int e = matrix.length - 1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (matrix[mid][0] <= target && 
                matrix[mid][matrix[mid].length - 1] >= target) {
                s = 0;
                e = matrix[mid].length - 1;
                while (s <= e) {
                    int mid2 = s + (e - s) / 2;
                    if (matrix[mid][mid2] == target) {
                        return true;
                    } else if (matrix[mid][mid2] < target) {
                        s = mid2 + 1;
                    } else {
                        e = mid2 - 1;
                    }
                }
                return false;
            } else if (matrix[mid][0] < target) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }

        return false;
    }
}
