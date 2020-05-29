package easy._600_699._661_image_smoother;

//Given a 2D integer matrix M representing the gray scale of an image,
// you need to design a smoother
// to make the gray scale of each cell
// becomes the average gray scale (rounding down) of all the 8 surrounding cells and itself.
// If a cell has less than 8 surrounding cells, then use as many as you can.
//
// Example 1:
//
//Input:
//[[1,1,1],
// [1,0,1],
// [1,1,1]]
//Output:
//[[0, 0, 0],
// [0, 0, 0],
// [0, 0, 0]]
//Explanation:
//For the point (0,0), (0,2), (2,0), (2,2): floor(3/4) = floor(0.75) = 0
//For the point (0,1), (1,0), (1,2), (2,1): floor(5/6) = floor(0.83333333) = 0
//For the point (1,1): floor(8/9) = floor(0.88888889) = 0
//
//
//
// Note:
//
// The value in the given matrix is in the range of [0, 255].
// The length and width of the given matrix are in the range of [1, 150].
//
// Related Topics Array


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:5 ms,击败了92.51% 的Java用户
  //  内存消耗:40 MB,击败了93.75% 的Java用户
  public int[][] imageSmoother(int[][] M) {
    int[][] res = new int[M.length][M[0].length];
    int count, sum;
    boolean left, right, up, down;
    for (int i = 0; i < res.length; i++) {
      for (int j = 0; j < res[0].length; j++) {
        count = 1;
        sum = M[i][j];
        left = false;
        right = false;
        up = false;
        down = false;
        if (0 < i) {
          count++;
          sum += M[i - 1][j];
          left = true;
        }
        if (i < res.length - 1) {
          count++;
          sum += M[i + 1][j];
          right = true;
        }
        if (0 < j) {
          count++;
          sum += M[i][j - 1];
          up = true;
        }
        if (j < res[0].length - 1) {
          count++;
          sum += M[i][j + 1];
          down = true;
        }
        if (left) {
          if (up) {
            count++;
            sum += M[i - 1][j - 1];
          }
          if (down) {
            count++;
            sum += M[i - 1][j + 1];
          }
        }
        if (right) {
          if (up) {
            count++;
            sum += M[i + 1][j - 1];
          }
          if (down) {
            count++;
            sum += M[i + 1][j + 1];
          }
        }
        res[i][j] = sum / count;
      }
    }

    return res;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

