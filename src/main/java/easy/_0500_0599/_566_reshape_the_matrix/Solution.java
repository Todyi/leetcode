package easy._0500_0599._566_reshape_the_matrix;

//In MATLAB, there is a very useful function called 'reshape',
// which can reshape a matrix into a new one with different size but keep its original data.
//
//
//
//You're given a matrix represented by a two-dimensional array,
// and two positive integers r and c
// representing the row number and column number of the wanted reshaped matrix, respectively.
//
// The reshaped matrix need to be filled with all the elements of the original matrix
// in the same row-traversing order as they were.
//
//
//
//If the 'reshape' operation with given parameters is possible and legal,
// output the new reshaped matrix; Otherwise, output the original matrix.
//
//
// Example 1:
//
//Input:
//nums =
//[[1,2],
// [3,4]]
//r = 1, c = 4
//Output:
//[[1,2,3,4]]
//Explanation: The row-traversing of nums is [1,2,3,4].
// The new reshaped matrix is a 1 * 4 matrix, fill it row by row by using the previous list.
//
//
//
// Example 2:
//
//Input:
//nums =
//[[1,2],
// [3,4]]
//r = 2, c = 4
//Output:
//[[1,2],
// [3,4]]
//Explanation: There is no way to reshape a 2 * 2 matrix to a 2 * 4 matrix.
// So output the original matrix.
//
//
//
// Note:
//
// The height and width of the given matrix is in range [1, 100].
// The given r and c are all positive.
//
// Related Topics Array


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:1 ms,击败了100.00% 的Java用户
  //  内存消耗:40.6 MB,击败了55.56% 的Java用户
  public int[][] matrixReshape(int[][] nums, int r, int c) {
    if (nums.length * nums[0].length < r * c) {
      return nums;
    }
    int[][] res = new int[r][c];
    int n = 0, m = 0;
    for (int i = 0; i < res.length; i++) {
      for (int j = 0; j < res[i].length; j++) {
        res[i][j] = nums[n][m];
        m++;
        if (m % nums[0].length == 0) {
          m = 0;
          n++;
        }
      }
    }
    return res;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

