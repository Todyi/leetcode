package easy._1300_1399._1380_lucky_numbers_in_a_matrix;

//Given a m * n matrix of distinct numbers, return all lucky numbers in the matrix in any order.
//
// A lucky number is an element of the matrix such that it is the minimum element in its row
// and maximum in its column.
//
//
// Example 1:
//
//
//Input: matrix = [[3,7,8],[9,11,13],[15,16,17]]
//Output: [15]
//Explanation: 15 is the only lucky number since it is the minimum in its row an
//d the maximum in its column
//
//
// Example 2:
//
//
//Input: matrix = [[1,10,4,2],[9,3,8,7],[15,16,17,12]]
//Output: [12]
//Explanation: 12 is the only lucky number since it is the minimum in its row an
//d the maximum in its column.
//
//
// Example 3:
//
//
//Input: matrix = [[7,8],[1,2]]
//Output: [7]
//
//
//
// Constraints:
//
//
// m == mat.length
// n == mat[i].length
// 1 <= n, m <= 50
// 1 <= matrix[i][j] <= 10^5.
// All elements in the matrix are distinct.
//
// Related Topics Array
// 👍 318 👎 31


import java.util.ArrayList;
import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:1 ms,击败了98.45% 的Java用户
  //  内存消耗:39.4 MB,击败了97.23% 的Java用户
//  public List<Integer> luckyNumbers(int[][] matrix) {
//    int row = matrix.length, column = matrix[0].length;
//    List<Integer> res = new ArrayList<>();
//
//    for (int[] rowArr : matrix) {
//      int columnIdx = 0, min = rowArr[0];
//      for (int j = 1; j < column; j++) {
//        if (rowArr[j] < min) {
//          columnIdx = j;
//          min = rowArr[j];
//        }
//      }
//      boolean isMax = true;
//      for (int j = 0; j < row; j++) {
//        if (min < matrix[j][columnIdx]) {
//          isMax = false;
//          break;
//        }
//      }
//      if (isMax) {
//        res.add(min);
//      }
//    }
//    return res;
//  }

  //  Runtime: 0 ms, faster than 100.00% of Java online submissions for Lucky Numbers in a Matrix.
  //  Memory Usage: 39.3 MB, less than 98.12% of Java online submissions for Lucky Numbers in a Matrix.
  public List<Integer> luckyNumbers(int[][] matrix) {
    if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
      return new ArrayList<Integer>();
    }

    // speed : 100%
    int row = matrix.length;
    List<Integer> rst = new ArrayList<>();
    boolean flag = true;
    for (int[] currRow : matrix) {
      int minIdx = minPosInRow(currRow); // find min in current row
      for (int i = 0; i < row; i++) { // check col of min
        if (matrix[i][minIdx] > currRow[minIdx]) {
          flag = false;
          break; // condition not met, go to next row to save time
        }
      }
      if (flag) {
        rst.add(currRow[minIdx]);
      }
      flag = true;
    }

    return rst;
  }

  public int minPosInRow(int[] row) {
    int min = row[0];
    int pos = 0;
    for (int i = 0; i < row.length; i++) {
      if (row[i] < min) {
        min = row[i];
        pos = i;
      }
    }
    return pos;
  }

}
//leetcode submit region end(Prohibit modification and deletion)

