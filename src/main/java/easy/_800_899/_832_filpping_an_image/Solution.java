package easy._800_899._832_filpping_an_image;

//Given a binary matrix A, we want to flip the image horizontally,
// then invert it, and return the resulting image.
//
// To flip an image horizontally means that each row of the image is reversed.
// For example, flipping [1, 1, 0] horizontally results in [0, 1, 1].
//
// To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0.
// For example, inverting [0, 1, 1] results in [1, 0, 0].
//
// Example 1:
//
//
//Input: [[1,1,0],[1,0,1],[0,0,0]]
//Output: [[1,0,0],[0,1,0],[1,1,1]]
//Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
//Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]
//
//
// Example 2:
//
//
//Input: [[1,1,0,0],[1,0,0,1],[0,1,1,1],[1,0,1,0]]
//Output: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
//Explanation: First reverse each row: [[0,0,1,1],[1,0,0,1],[1,1,1,0],[0,1,0,1]]
//.
//Then invert the image: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
//
//
// Notes:
//
//
// 1 <= A.length = A[0].length <= 20
// 0 <= A[i][j] <= 1
//
// Related Topics Array
// 👍 919 👎 150


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:39.5 MB,击败了83.28% 的Java用户
  public int[][] flipAndInvertImage(int[][] A) {
    for (int i = 0; i < A.length; i++) {
      int[] row = A[i];
      for (int j = 0; j < row.length / 2; j++) {
        int l = Math.abs(row[j] - 1);
        row[j] = Math.abs(row[row.length - 1 - j] - 1);
        row[row.length - 1 - j] = l;
      }
      if (row.length % 2 != 0) {
        row[row.length / 2] = Math.abs(row[row.length / 2] - 1);
      }
    }
    return A;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

