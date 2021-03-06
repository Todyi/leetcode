package medium._0200_0299._221_maximal_square;

//Given an m x n binary matrix filled with 0's and 1's, find the largest square
//containing only 1's and return its area.
//
//
// Example 1:
//
//
//Input: matrix = [["1","0","1","0","0"],["1","0","1","1","1"],["1","1","1","1",
//"1"],["1","0","0","1","0"]]
//Output: 4
//
//
// Example 2:
//
//
//Input: matrix = [["0","1"],["1","0"]]
//Output: 1
//
//
// Example 3:
//
//
//Input: matrix = [["0"]]
//Output: 0
//
//
//
// Constraints:
//
//
// m == matrix.length
// n == matrix[i].length
// 1 <= m, n <= 300
// matrix[i][j] is '0' or '1'.
//
// Related Topics Dynamic Programming
// 👍 4243 👎 103


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:3 ms,击败了98.60% 的Java用户
  //  内存消耗:41.4 MB,击败了98.88% 的Java用户
//  public int maximalSquare(char[][] matrix) {
//    int m = matrix.length, n = matrix[0].length, max = 0;
//    int[][] map = new int[m][n];
//    for (int i = 0; i < m; i++) {
//      for (int j = 0; j < n; j++) {
//        if (matrix[i][j] == '1') {
//          if (0 < i && 0 < j && matrix[i - 1][j - 1] == '1') {
//            int temp = map[i - 1][j - 1], curMax = temp;
//            for (; temp > 0; temp--) {
//              if (i - temp < 0 || matrix[i - temp][j] == '0'
//                  || j - temp < 0 || matrix[i][j - temp] == '0') {
//                curMax = temp - 1;
//              }
//            }
//            map[i][j] = curMax + 1;
//          } else {
//            map[i][j] = 1;
//          }
//          max = Math.max(map[i][j], max);
//        }
//      }
//    }
//    return max * max;
//  }


  //  解答成功:
  //  执行耗时:1 ms,击败了100.00% 的Java用户
  //  内存消耗:42.4 MB,击败了40.65% 的Java用户
  int m, n;

  public int maximalSquare(char[][] matrix) {
    m = matrix.length;
    n = matrix[0].length;
    return max_dfs(matrix, 1, 0);
  }

  public int max_dfs(char[][] matrix, int maxLen, int curRow) {
    for (int i = curRow; i < m; i++) {
      for (int j = 0; j < n; j++) {
        if (isSquare(matrix, maxLen, i, j)) {
          return Math.max(maxLen * maxLen, max_dfs(matrix, maxLen + 1, i));
        }
      }
    }
    return 0;
  }

  public boolean isSquare(char[][] matrix, int maxLen, int i, int j) {
    if (maxLen == 1 && matrix[i][j] == '1') {
      return true;
    }
    int maxI = i + maxLen, maxJ = j + maxLen;
    if (m < maxI || n < maxJ) {
      return false;
    }
    for (int r = i; r < maxI; r++) {
      for (int c = j; c < maxJ; c++) {
        if (matrix[r][c] == '0') {
          return false;
        }
      }
    }
    return true;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

