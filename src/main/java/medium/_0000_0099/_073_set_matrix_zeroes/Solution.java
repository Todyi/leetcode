package medium._0000_0099._073_set_matrix_zeroes;

//Given an m x n matrix. If an element is 0, set its entire row and column to 0.
// Do it in-place.
//
// Follow up:
//
//
// A straight forward solution using O(mn) space is probably a bad idea.
// A simple improvement uses O(m + n) space, but still not the best solution.
// Could you devise a constant space solution?
//
//
//
// Example 1:
//
//
//Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
//Output: [[1,0,1],[0,0,0],[1,0,1]]
//
//
// Example 2:
//
//
//Input: matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
//Output: [[0,0,0,0],[0,4,5,0],[0,3,1,0]]
//
//
//
// Constraints:
//
//
// m == matrix.length
// n == matrix[0].length
// 1 <= m, n <= 200
// -2^31 <= matrix[i][j] <= 2^31 - 1
//
// Related Topics Array
// 👍 2804 👎 340


import java.util.ArrayList;
import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:1 ms,击败了91.90% 的Java用户
  //  内存消耗:40.3 MB,击败了86.66% 的Java用户
  public void setZeroes(int[][] matrix) {
    int m = matrix.length, n = matrix[0].length;
    List<Integer[]> list = new ArrayList<>();
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        if (matrix[i][j] == 0) {
          list.add(new Integer[]{i, j});
        }
      }
    }
    for (Integer[] coordinates : list) {
      setZero(matrix, coordinates[0], coordinates[1]);
    }
  }

  public void setZero(int[][] matrix, int x, int y) {
    for (int i = 0; i < matrix.length; i++) {
      matrix[i][y] = 0;
    }
    for (int i = 0; i < matrix[0].length; i++) {
      matrix[x][i] = 0;
    }
  }
}
//leetcode submit region end(Prohibit modification and deletion)

