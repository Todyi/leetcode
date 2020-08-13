package easy._800_899._840_magic_squares_in_grid;

//A 3 x 3 magic square is a 3 x 3 grid filled with distinct numbers from 1 to 9
// such that each row, column, and both diagonals all have the same sum.
//
// Given an grid of integers, how many 3 x 3 "magic square" subgrids are there?
//(Each subgrid is contiguous).
//
//
//
// Example 1:
//
//
//Input: [[4,3,8,4],
//        [9,5,1,9],
//        [2,7,6,2]]
//Output: 1
//Explanation:
//The following subgrid is a 3 x 3 magic square:
//438
//951
//276
//
//while this one is not:
//384
//519
//762
//
//In total, there is only one magic square inside the given grid.
//
//
// Note:
//
//
// 1 <= grid.length <= 10
// 1 <= grid[0].length <= 10
// 0 <= grid[i][j] <= 15
//
// Related Topics Array
// 👍 155 👎 1201


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:37.6 MB,击败了58.58% 的Java用户
  public int numMagicSquaresInside(int[][] grid) {
    int count = 0;
    for (int i = 0; i < grid.length - 2; i++) {
      for (int j = 0; j < grid[0].length - 2; j++) {
        if (isOne2Nine(grid, i, j) && isMagic(grid, i, j)) {
          count++;
        }
      }
    }
    return count;
  }

  public boolean isOne2Nine(int[][] grid, int i, int j) {
    int one2Nine = 57;//(1*11)^2^3^4^(5*11)^6^7^8^9
    for (int m = i; m < i + 3; m++) {
      for (int n = j; n < j + 3; n++) {
        one2Nine ^= grid[m][n] == 1 || grid[m][n] == 5 ? grid[m][n] * 11 : grid[m][n];
      }
    }
    return one2Nine == 0;
  }

  public boolean isMagic(int[][] grid, int i, int j) {
    int lt2rb = grid[i][j] + grid[i + 1][j + 1] + grid[i + 2][j + 2];
    int lb2rt = grid[i][j + 2] + grid[i + 1][j + 1] + grid[i + 2][j];
    if (lt2rb != lb2rt) {
      return false;
    }
    int row0 = grid[i][j] + grid[i][j + 1] + grid[i][j + 2];
    if (lt2rb != row0) {
      return false;
    }
    int row1 = grid[i + 1][j] + grid[i + 1][j + 1] + grid[i + 1][j + 2];
    if (lt2rb != row1) {
      return false;
    }
    int row2 = grid[i + 2][j] + grid[i + 2][j + 1] + grid[i + 2][j + 2];
    if (lt2rb != row2) {
      return false;
    }
    int col0 = grid[i][j] + grid[i + 1][j] + grid[i + 2][j];
    if (lt2rb != col0) {
      return false;
    }
    int col1 = grid[i][j + 1] + grid[i + 1][j + 1] + grid[i + 2][j + 1];
    if (lt2rb != col1) {
      return false;
    }
    int col2 = grid[i][j + 2] + grid[i + 1][j + 2] + grid[i + 2][j + 2];
    if (lt2rb != col2) {
      return false;
    }
    return true;
  }

}
//leetcode submit region end(Prohibit modification and deletion)

