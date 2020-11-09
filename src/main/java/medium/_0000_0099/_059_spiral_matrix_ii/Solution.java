package medium._0000_0099._059_spiral_matrix_ii;

//Given a positive integer n, generate a square matrix filled with elements from
// 1 to n^2 in spiral order.
//
// Example:
//
//
//Input: 3
//Output:
//[
// [ 1, 2, 3 ],
// [ 8, 9, 4 ],
// [ 7, 6, 5 ]
//]
//
// Related Topics Array
// 👍 1241 👎 121


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:37 MB,击败了10.67% 的Java用户
  public int[][] generateMatrix(int n) {
    int[][] res = new int[n][n];
    int idx = 1, len = n, x = 0, y = 0;
    while (0 < n) {
      int tmpX = len - 1 - x, tmpY = len - 1 - y;
      for (int j = y; j <= tmpY && res[x][j] == 0; j++) {
        res[x][j] = idx++;
      }
      for (int i = x + 1; i <= tmpX && res[i][tmpY] == 0; i++) {
        res[i][tmpY] = idx++;
      }
      for (int j = tmpY - 1; y <= j && res[tmpX][j] == 0; j--) {
        res[tmpX][j] = idx++;
      }
      for (int i = tmpX - 1; x < i && res[i][y] == 0; i--) {
        res[i][y] = idx++;
      }
      x++;
      y++;
      n -= 2;
    }

    return res;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

