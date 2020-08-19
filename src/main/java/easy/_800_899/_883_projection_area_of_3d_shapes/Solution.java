package easy._800_899._883_projection_area_of_3d_shapes;

//On a N * N grid, we place some 1 * 1 * 1 cubes that are axis-aligned with the x, y, and z axes.
//
// Each value v = grid[i][j] represents a tower of v cubes placed on top of grid
// cell (i, j).
//
// Now we view the projection of these cubes onto the xy, yz, and zx planes.
//
// A projection is like a shadow, that maps our 3 dimensional figure to a 2 dimensional plane.
//
// Here, we are viewing the "shadow" when looking at the cubes from the top,
// the front, and the side.
//
// Return the total area of all three projections.
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
//Output: 5
//
//
//
// Example 2:
//
//
//Input: [[1,2],[3,4]]
//Output: 17
//Explanation:
//Here are the three projections ("shadows") of the shape made with each axis-al
//igned plane.
//
//
//
//
// Example 3:
//
//
//Input: [[1,0],[0,2]]
//Output: 8
//
//
//
// Example 4:
//
//
//Input: [[1,1,1],[1,0,1],[1,1,1]]
//Output: 14
//
//
//
// Example 5:
//
//
//Input: [[2,2,2],[2,1,2],[2,2,2]]
//Output: 21
//
//
//
//
//
//
//
// Note:
//
//
// 1 <= grid.length = grid[0].length <= 50
// 0 <= grid[i][j] <= 50
//
//
//
//
//
//
//
//
//
// Related Topics Math
// 👍 256 👎 835


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:2 ms,击败了58.13% 的Java用户
  //  内存消耗:39 MB,击败了94.21% 的Java用户
  public int projectionArea(int[][] grid) {
    int xy = 0, xz = 0, yz = 0;
    int[] mapX = new int[51];
    int[] mapY = new int[51];
    for (int x = 0; x < grid.length; x++) {
      for (int y = 0; y < grid[x].length; y++) {
        if (0 < grid[x][y]) {
          xy++;
          if (mapX[x] < grid[x][y]) {
            xz += grid[x][y] - mapX[x];
            mapX[x] = grid[x][y];
          }
          if (mapY[y] < grid[x][y]) {
            yz += grid[x][y] - mapY[y];
            mapY[y] = grid[x][y];
          }
        }
      }

    }
    return xy + xz + yz;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

