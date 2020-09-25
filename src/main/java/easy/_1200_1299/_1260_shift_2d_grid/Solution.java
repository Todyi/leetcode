package easy._1200_1299._1260_shift_2d_grid;

//Given a 2D grid of size m x n and an integer k. You need to shift the grid k times.
//
// In one shift operation:
//
//
// Element at grid[i][j] moves to grid[i][j + 1].
// Element at grid[i][n - 1] moves to grid[i + 1][0].
// Element at grid[m - 1][n - 1] moves to grid[0][0].
//
//
// Return the 2D grid after applying shift operation k times.
//
//
// Example 1:
//
//
//Input: grid = [
// [1,2,3],
// [4,5,6],
// [7,8,9]],
// k = 1
//Output: [
// [9,1,2],
// [3,4,5],
// [6,7,8]]
//
//
// Example 2:
//
//
//Input: grid = [[3,8,1,9],[19,7,2,5],[4,6,11,10],[12,0,21,13]], k = 4
//Output: [[12,0,21,13],[3,8,1,9],[19,7,2,5],[4,6,11,10]]
//
//
// Example 3:
//
//
//Input: grid = [[1,2,3],[4,5,6],[7,8,9]], k = 9
//Output: [[1,2,3],[4,5,6],[7,8,9]]
//
//
//
// Constraints:
//
//
// m == grid.length
// n == grid[i].length
// 1 <= m <= 50
// 1 <= n <= 50
// -1000 <= grid[i][j] <= 1000
// 0 <= k <= 100
//
// Related Topics Array
// 👍 241 👎 94


import java.util.ArrayList;
import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:4 ms,击败了96.85% 的Java用户
  //  内存消耗:40.1 MB,击败了68.09% 的Java用户
//  public List<List<Integer>> shiftGrid(int[][] grid, int k) {
//    List<List<Integer>> res = new ArrayList<>();
//    int m = grid.length, n = grid[0].length, len = m * n;
//    k %= len;
//    int r = k == 0 ? 0 : (len - k) / n, c = k == 0 ? 0 : len - k - r * n;
//    while (res.size() < m) {
//      List<Integer> row = new ArrayList<>();
//      while (row.size() < n) {
//        row.add(grid[r][c++]);
//        if (c == n) {
//          c = 0;
//          if (++r == m) {
//            r = 0;
//          }
//        }
//      }
//      res.add(row);
//    }
//    return res;
//  }


  //  解答成功:
  //  执行耗时:3 ms,击败了100.00% 的Java用户
  //  内存消耗:40.3 MB,击败了48.61% 的Java用户
  public List<List<Integer>> shiftGrid(int[][] grid, int k) {
    List<List<Integer>> res = new ArrayList<>();
    int m = grid.length, n = grid[0].length, len = m * n;
    int[] tmp = new int[len];
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        tmp[(i * n + j + k) % len] = grid[i][j];
      }
    }
    int idx = 0;
    for (int i = 0; i < m; i++) {
      List<Integer> row = new ArrayList<>();
      for (int j = 0; j < n; j++) {
        row.add(tmp[idx++]);
      }
      res.add(row);
    }
    return res;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

