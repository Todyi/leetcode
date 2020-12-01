package medium._0000_0099._062_unique_paths;

//A robot is located at the top-left corner of a m x n grid (marked 'Start' in the diagram below).
//
// The robot can only move either down or right at any point in time.
// The robot is trying to reach the bottom-right corner of the grid
// (marked 'Finish' in the diagram below).
//
// How many possible unique paths are there?
//
//
// Example 1:
//
//
//Input: m = 3, n = 7
//Output: 28
//
//
// Example 2:
//
//
//Input: m = 3, n = 2
//Output: 3
//Explanation:
//From the top-left corner, there are a total of 3 ways to reach the bottom-righ
//t corner:
//1. Right -> Down -> Down
//2. Down -> Down -> Right
//3. Down -> Right -> Down
//
//
// Example 3:
//
//
//Input: m = 7, n = 3
//Output: 28
//
//
// Example 4:
//
//
//Input: m = 3, n = 3
//Output: 6
//
//
//
// Constraints:
//
//
// 1 <= m, n <= 100
// It's guaranteed that the answer will be less than or equal to 2 * 10^9.
//
// Related Topics Array Dynamic Programming
// 👍 4054 👎 226


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:35.5 MB,击败了87.71% 的Java用户
  public int uniquePaths(int m, int n) {
    int[][] countMap = new int[++m][++n];
    for (int i = 1; i < n; i++) {
      countMap[1][i] = 1;
    }
    for (int j = 2; j < m; j++) {
      countMap[j][1] = 1;
      for (int i = 2; i < n; i++) {
        countMap[j][i] = countMap[j - 1][i] + countMap[j][i - 1];
      }
    }
    return countMap[m - 1][n - 1];
  }


}
//leetcode submit region end(Prohibit modification and deletion)
