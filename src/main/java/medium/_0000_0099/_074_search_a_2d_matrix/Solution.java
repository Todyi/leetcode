package medium._0000_0099._074_search_a_2d_matrix;

//Write an efficient algorithm that searches for a value in an m x n matrix.
// This matrix has the following properties:
//
//
// Integers in each row are sorted from left to right.
// The first integer of each row is greater than the last integer of the previous row.
//
//
//
// Example 1:
//
//
//Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,50]], target = 3
//Output: true
//
//
// Example 2:
//
//
//Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,50]], target = 13
//Output: false
//
//
// Example 3:
//
//
//Input: matrix = [], target = 0
//Output: false
//
//
//
// Constraints:
//
//
// m == matrix.length
// n == matrix[i].length
// 0 <= m, n <= 100
// -104 <= matrix[i][j], target <= 104
//
// Related Topics Array Binary Search
// 👍 2591 👎 182


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:38.2 MB,击败了79.44% 的Java用户
  public boolean searchMatrix(int[][] matrix, int target) {
    if (matrix.length < 1 || matrix[0].length < 1) {
      return false;
    }
    int m = matrix.length, n = matrix[0].length,
        l = 0, r = m, mid = (l + r) / 2, row = -1;
    while (l < r) {
      if (matrix[mid][0] == target) {
        return true;
      } else if (matrix[mid][0] < target) {
        l = mid;
        if (l + 1 < m && target < matrix[l + 1][0] || l == m - 1) {
          row = l;
          break;
        }
      } else {
        r = mid;
      }
      mid = (l + r) / 2;
    }
    if (row == -1) {
      return false;
    }
    l = 0;
    r = n;
    mid = (l + r) / 2;
    while (l < r) {
      if (matrix[row][mid] == target) {
        return true;
      } else if (matrix[row][mid] < target) {
        l = mid;
      } else {
        r = mid;
      }
      if (mid == (l + r) / 2) {
        return false;
      }
      mid = (l + r) / 2;
    }
    return false;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

