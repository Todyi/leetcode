package medium._0200_0299._240_search_a_2d_matrix_ii;

//Write an efficient algorithm that searches for a target value in an m x n integer matrix.
// The matrix has the following properties:
//
//
// Integers in each row are sorted in ascending from left to right.
// Integers in each column are sorted in ascending from top to bottom.
//
//
//
// Example 1:
//
//
//Input: matrix =
// [[1,4,7,11,15],
// [2,5,8,12,19],
// [3,6,9,16,22],
// [10,13,14,17,24],
// [18,21,23,26,30]], target = 5
//Output: true
//
//
// Example 2:
//
//
//Input: matrix = [[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[1
//8,21,23,26,30]], target = 20
//Output: false
//
//
//
// Constraints:
//
//
// m == matrix.length
// n == matrix[i].length
// 1 <= n, m <= 300
// -109 <= matix[i][j] <= 109
// All the integers in each row are sorted in ascending order.
// All the integers in each column are sorted in ascending order.
// -109 <= target <= 109
//
// Related Topics Binary Search Divide and Conquer
// 👍 4463 👎 86


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:4 ms,击败了100.00% 的Java用户
  //  内存消耗:44.8 MB,击败了48.89% 的Java用户
  public boolean searchMatrix(int[][] matrix, int target) {
    int row = 0, col = matrix[0].length - 1;
    while (row < matrix.length && 0 <= col) {
      if (matrix[row][col] == target) {
        return true;
      } else if (target < matrix[row][col]) {
        col--;
      } else {
        row++;
      }
    }
    return false;
  }


}
//leetcode submit region end(Prohibit modification and deletion)

