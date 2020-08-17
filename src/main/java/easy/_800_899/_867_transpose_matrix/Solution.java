package easy._800_899._867_transpose_matrix;

//Given a matrix A, return the transpose of A.
//
// The transpose of a matrix is the matrix flipped over it's main diagonal,
// switching the row and column indices of the matrix.
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
//Input: [[1,2,3],[4,5,6],[7,8,9]]
//Output: [[1,4,7],[2,5,8],[3,6,9]]
//
//
//
// Example 2:
//
//
//Input: [[1,2,3],[4,5,6]]
//Output: [[1,4],[2,5],[3,6]]
//
//
//
//
// Note:
//
//
// 1 <= A.length <= 1000
// 1 <= A[0].length <= 1000
//
//
// Related Topics Array
// 👍 444 👎 300


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:40.4 MB,击败了70.42% 的Java用户
  public int[][] transpose(int[][] A) {
    int[][] res = new int[A[0].length][A.length];
    for (int i = 0; i < A.length; i++) {
      for (int j = 0; j < A[i].length; j++) {
        res[j][i] = A[i][j];
      }
    }
    return res;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

