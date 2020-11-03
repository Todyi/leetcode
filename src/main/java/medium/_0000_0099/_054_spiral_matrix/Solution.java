package medium._0000_0099._054_spiral_matrix;

//Given a matrix of m x n elements (m rows, n columns), return all elements of t
//he matrix in spiral order.
//
// Example 1:
//
//
//Input:
//[
// [ 1, 2, 3 ],
// [ 4, 5, 6 ],
// [ 7, 8, 9 ]
//]
//Output: [1,2,3,6,9,8,7,4,5]
//
//
// Example 2:
//
//
//Input:
//[
//  [1, 2, 3, 4],
//  [5, 6, 7, 8],
//  [9,10,11,12]
//]
//Output: [1,2,3,4,8,12,11,10,9,5,6,7]
//
// Related Topics Array
// 👍 2987 👎 611


import java.util.ArrayList;
import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:37 MB,击败了9.20% 的Java用户
  public List<Integer> spiralOrder(int[][] matrix) {
    List<Integer> res = new ArrayList<>();
    int len = matrix.length;
    if (len == 0) {
      return res;
    }
    int mid = len / 2, rLen = matrix[0].length, rMid = rLen / 2, x = 0, y = 0;
    if (rLen == 0) {
      return res;
    }
    while (true) {
      for (int i = y; i < rLen - y; i++) {
        res.add(matrix[x][i]);
      }
      int tmpY = rLen - y - 1;
      if (-1 < tmpY) {
        for (int i = x + 1; i < len - x; i++) {
          res.add(matrix[i][tmpY]);
        }
      }
      int tmpX = len - x - 1;
      if (x < tmpX) {
        for (int i = rLen - y - 2; i > y; i--) {
          res.add(matrix[tmpX][i]);
        }
      }
      if (y < tmpY) {
        for (int i = tmpX; i > x; i--) {
          res.add(matrix[i][y]);
        }
      }
      x++;
      y++;
      if (mid < x || rMid < y || x == len - 1 || y == rLen - 1) {
        break;
      }
    }
    return res;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

