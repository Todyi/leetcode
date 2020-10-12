package easy._0600_0699._661_image_smoother;

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
  //  执行耗时:4 ms,击败了97.74% 的Java用户
  //  内存消耗:40.4 MB,击败了87.50% 的Java用户
  public int[][] imageSmoother(int[][] M) {
    int[][] res = new int[M.length][M[0].length];
    for (int i = 0; i < res.length; i++) {
      for (int j = 0; j < res[0].length; j++) {
        res[i][j] = findAvg(M, i, j);
      }
    }
    return res;
  }

  public int findAvg(int[][] M, int i, int j) {
    int one = 0, two = 0, three = 0, four = 0, five = M[i][j], six = 0, seven = 0, eight = 0, nine = 0, count = 1;
    if (0 < i && 0 < j) {
      one = M[i - 1][j - 1];
      count++;
    }

    if (0 < i) {
      two = M[i - 1][j];
      count++;
    }

    if (0 < i && j < M[0].length - 1) {
      three = M[i - 1][j + 1];
      count++;
    }

    if (0 < j) {
      four = M[i][j - 1];
      count++;
    }

    if (j < M[0].length - 1) {
      six = M[i][j + 1];
      count++;
    }
    if (i < M.length - 1 && 0 < j) {
      seven = M[i + 1][j - 1];
      count++;
    }
    if (i < M.length - 1) {
      eight = M[i + 1][j];
      count++;
    }
    if (i < M.length - 1 && j < M[0].length - 1) {
      nine = M[i + 1][j + 1];
      count++;
    }
    return (one + two + three + four + five + six + seven + eight + nine) / count;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

