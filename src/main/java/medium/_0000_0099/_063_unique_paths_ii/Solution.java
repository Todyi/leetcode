package medium._0000_0099._063_unique_paths_ii;

//A robot is located at the top-left corner of a m x n grid (marked 'Start' in the diagram below).
//
// The robot can only move either down or right at any point in time. The robot
//is trying to reach the bottom-right corner of the grid (marked 'Finish' in the diagram below).
//
// Now consider if some obstacles are added to the grids. How many unique paths
//would there be?
//
// An obstacle and space is marked as 1 and 0 respectively in the grid.
//
//
// Example 1:
//
//
//Input: obstacleGrid = [[0,0,0],[0,1,0],[0,0,0]]
//Output: 2
//Explanation: There is one obstacle in the middle of the 3x3 grid above.
//There are two ways to reach the bottom-right corner:
//1. Right -> Right -> Down -> Down
//2. Down -> Down -> Right -> Right
//
//
// Example 2:
//
//
//Input: obstacleGrid = [[0,1],[0,0]]
//Output: 1
//
//
//
// Constraints:
//
//
// m == obstacleGrid.length
// n == obstacleGrid[i].length
// 1 <= m, n <= 100
// obstacleGrid[i][j] is 0 or 1.
//
// Related Topics Array Dynamic Programming
// 👍 2228 👎 267


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:38.5 MB,击败了27.37% 的Java用户
  public int uniquePathsWithObstacles(int[][] obstacleGrid) {
    int m = obstacleGrid.length + 1, n = obstacleGrid[0].length + 1;
    int[][] countMap = new int[m][n];
    for (int i = 1; i < n; i++) {
      if (obstacleGrid[0][i - 1] == 1) {
        break;
      }
      countMap[1][i] = 1;
    }
    for (int i = 1; i < m; i++) {
      if (obstacleGrid[i - 1][0] == 1) {
        break;
      }
      countMap[i][1] = 1;
    }

    for (int i = 2; i < m; i++) {
      for (int j = 2; j < n; j++) {
        if (obstacleGrid[i - 1][j - 1] == 0) {
          countMap[i][j] = countMap[i - 1][j] + countMap[i][j - 1];
        }
      }
    }

    return countMap[m - 1][n - 1];
  }
}
//leetcode submit region end(Prohibit modification and deletion)

