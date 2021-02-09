package medium._0200_0299._200_number_of_islands;

//Given an m x n 2d grid map of '1's (land) and '0's (water), return the number of islands.
//
// An island is surrounded by water and is formed by connecting adjacent lands horizontally
// or vertically. You may assume all four edges of the grid are all surrounded by water.
//
//
// Example 1:
//
//
//Input: grid = [
//  ["1","1","1","1","0"],
//  ["1","1","0","1","0"],
//  ["1","1","0","0","0"],
//  ["0","0","0","0","0"]
//]
//Output: 1
//
//
// Example 2:
//
//
//Input: grid = [
//  ["1","1","0","0","0"],
//  ["1","1","0","0","0"],
//  ["0","0","1","0","0"],
//  ["0","0","0","1","1"]
//]
//Output: 3
//
//
//
// Constraints:
//
//
// m == grid.length
// n == grid[i].length
// 1 <= m, n <= 300
// grid[i][j] is '0' or '1'.
//
// Related Topics Depth-first Search Breadth-first Search Union Find
// 👍 7605 👎 234


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:1 ms,击败了100.00% 的Java用户
  //  内存消耗:41.7 MB,击败了37.42% 的Java用户
  public int numIslands(char[][] grid) {
    int count = 0, m = grid.length, n = grid[0].length;
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        if (grid[i][j] == '1') {
          count++;
          dfs(grid, i, j);
        }
      }
    }
    return count;
  }

  public void dfs(char[][] grid, int m, int n) {
    if (m < 0 || grid.length == m) {
      return;
    }
    if (n < 0 || grid[0].length == n) {
      return;
    }
    if (grid[m][n] != '1') {
      return;
    }
    grid[m][n] = '2';
    dfs(grid, m - 1, n);
    dfs(grid, m + 1, n);
    dfs(grid, m, n - 1);
    dfs(grid, m, n + 1);
  }
}
//leetcode submit region end(Prohibit modification and deletion)

