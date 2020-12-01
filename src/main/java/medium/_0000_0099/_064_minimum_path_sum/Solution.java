package medium._0000_0099._064_minimum_path_sum;

//Given a m x n grid filled with non-negative numbers, find a path from top left to bottom right,
// which minimizes the sum of all numbers along its path.
//
// Note: You can only move either down or right at any point in time.
//
//
// Example 1:
//
//
//Input: grid = [[1,3,1],[1,5,1],[4,2,1]]
//Output: 7
//Explanation: Because the path 1 → 3 → 1 → 1 → 1 minimizes the sum.
//
//
// Example 2:
//
//
//Input: grid = [[1,2,3],[4,5,6]]
//Output: 12
//
//
//
// Constraints:
//
//
// m == grid.length
// n == grid[i].length
// 1 <= m, n <= 200
// 0 <= grid[i][j] <= 100
//
// Related Topics Array Dynamic Programming
// 👍 3873 👎 76


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:2 ms,击败了81.25% 的Java用户
  //  内存消耗:41.4 MB,击败了95.53% 的Java用户
  public int minPathSum(int[][] grid) {
    int m = grid.length, n = grid[0].length;
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        if (i == 0 && j == 0){
          continue;
        }
        int pathSumUp = Integer.MAX_VALUE, pathSumLeft = Integer.MAX_VALUE;
        if (0 < i) {
          pathSumUp = grid[i - 1][j];
        }
        if (0 < j) {
          pathSumLeft = grid[i][j - 1];
        }
        grid[i][j] = Math.min(pathSumLeft, pathSumUp) + grid[i][j];
      }
    }
    return grid[m - 1][n - 1];
  }

}
//leetcode submit region end(Prohibit modification and deletion)

