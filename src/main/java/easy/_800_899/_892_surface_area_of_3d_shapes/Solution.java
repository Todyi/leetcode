package easy._800_899._892_surface_area_of_3d_shapes;

//On a N * N grid, we place some 1 * 1 * 1 cubes.
//
// Each value v = grid[i][j] represents a tower of v cubes placed on top of grid cell (i, j).
//
// Return the total surface area of the resulting shapes.
//
//
//
//
//
//
//
//
//
//
//
//
//
// Example 1:
//
//
//Input: [[2]]
//Output: 10
//
//
//
// Example 2:
//
//
//Input: [[1,2],[3,4]]
//Output: 34
//
//
//
// Example 3:
//
//
//Input: [[1,0],[0,2]]
//Output: 16
//
//
//
// Example 4:
//
//
//Input: [[1,1,1],[1,0,1],[1,1,1]]
//Output: 32
//
//
//
// Example 5:
//
//
//Input: [[2,2,2],[2,1,2],[2,2,2]]
//Output: 46
//
//
//
//
// Note:
//
//
// 1 <= N <= 50
// 0 <= grid[i][j] <= 50
//
//
//
//
//
//
// Related Topics Math Geometry
// 👍 254 👎 347


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:2 ms,击败了97.39% 的Java用户
  //  内存消耗:39 MB,击败了89.55% 的Java用户
  public int surfaceArea(int[][] grid) {
    int num = 0;
    int adjoin = 0;
    for (int i = 0; i < grid.length; i++) {
      for (int j = 0; j < grid[i].length; j++) {
        num += grid[i][j];
        if (0 < j) {
          adjoin += Math.min(grid[i][j - 1], grid[i][j]);
        }
        if (0 < grid[i][j]) {
          adjoin += grid[i][j] - 1;
          if (0 < i) {
            adjoin += Math.min(grid[i - 1][j], grid[i][j]);
          }
        }
      }
    }
    return 6 * num - 2 * adjoin;
  }

}
//leetcode submit region end(Prohibit modification and deletion)

