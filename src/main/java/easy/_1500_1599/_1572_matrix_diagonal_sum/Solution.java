package easy._1500_1599._1572_matrix_diagonal_sum;

//Given a square matrix mat, return the sum of the matrix diagonals.
//
// Only include the sum of all the elements on the primary diagonal and all the
//elements on the secondary diagonal that are not part of the primary diagonal.
//
//
// Example 1:
//
//
//Input: mat = [[1,2,3],
//             [4,5,6],
//             [7,8,9]]
//Output: 25
//Explanation: Diagonals sum: 1 + 5 + 9 + 3 + 7 = 25
//Notice that element mat[1][1] = 5 is counted only once.
//
//
// Example 2:
//
//
//Input: mat = [[1,1,1,1],
//             [1,1,1,1],
//             [1,1,1,1],
//             [1,1,1,1]]
//Output: 8
//
//
// Example 3:
//
//
//Input: mat = [[5]]
//Output: 5
//
//
//
// Constraints:
//
//
// n == mat.length == mat[i].length
// 1 <= n <= 100
// 1 <= mat[i][j] <= 100
//
// Related Topics Array
// 👍 170 👎 3


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:38.8 MB,击败了16.45% 的Java用户
  public int diagonalSum(int[][] mat) {
    int sum = 0, len = mat.length, lt2rbI = 0, lt2rbJ = 0, rt2lbI = 0, rt2lbJ = len - 1;
    while (lt2rbI < len) {
      sum += mat[lt2rbI++][lt2rbJ++] + mat[rt2lbI++][rt2lbJ--];
    }
    if ((len & 1) == 1) {
      len /= 2;
      sum -= mat[len][len];
    }

    return sum;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

