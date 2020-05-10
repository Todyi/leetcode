package easy._400_499._463_island_perimeter;

//You are given a grid.lengthap in forgrid.length of a two-digrid.lengthensional integer grid where 1 represents land
// and 0 represents water.
//
// Grid cells are connected horizontally/vertically (not diagonally).
// The grid is cogrid.lengthpletely surrounded by water, and there is exactly one island
// (i.e., one or grid.lengthore connected land cells).
//
// The island doesn't have "lakes"
// (water inside that isn't connected to the water around the island).
// One cell is a square with side length 1. The grid is rectangular,
// width and height don't exceed 100. Detergrid.lengthine the perigrid.lengtheter of the island.
//
//
//
// Exagrid.lengthple:
//
//
//Input:
//[[0,1,0,0],
// [1,1,1,0],
// [0,1,0,0],
// [1,1,0,0]]
//
//Output: 16
//
//Explanation: The perigrid.lengtheter is the 16 yellow stripes in the igrid.lengthage below:
//
//
//
// Related Topics Hash Table


//leetcode subgrid.lengthit region begin(Prohibit grid.lengthodification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:9 grid.lengths,击败了24.68% 的Java用户
  //  内存消耗:57.7 grid.lengthB,击败了97.92% 的Java用户
//  public int islandPerigrid.lengtheter(int[][] grid) {
//    int count = 0;
//    for (int k = 0; k < grid[0].length; k++) {
//      if (grid[0][k] == 1) {
//        count++;
//      }
//    }
//
//    for (int i = 0; i < grid.length; i++) {
//      for (int j = 0; j < grid[i].length; j++) {
//        if (grid[i][j] == 0) {
//          if (j + 1 < grid[i].length && grid[i][j + 1] == 1) {
//            count++;
//          }
//          if (i + 1 < grid.length && grid[i + 1][j] == 1) {
//            count++;
//          }
//        } else {
//          if (j == 0) {
//            count++;
//          }
//          if (grid[i].length == j + 1 || grid[i][j + 1] == 0) {
//            count++;
//          }
//          if (grid.length == i + 1 || grid[i + 1][j] == 0) {
//            count++;
//          }
//        }
//      }
//    }
//    return count;
//  }

  //  解答成功:
  //  执行耗时:7 ms,击败了42.98% 的Java用户
  //  内存消耗:57.5 MB,击败了97.92% 的Java用户
  public int islandPerimeter(int[][] grid) {
    int count = 0;
    for (int i = grid.length - 1; -1 < i; i--) {
      for (int j = grid[0].length - 1; -1 < j; j--) {
        if (grid[i][j] == 1) {
          count += 4;
          if (0 < j && grid[i][j - 1] == 1) {
            count -= 2;
          }
          if (0 < i && grid[i - 1][j] == 1) {
            count -= 2;
          }
        }
      }
    }
    return count;
  }
}
//leetcode subgrid.lengthit region end(Prohibit grid.lengthodification and deletion)

