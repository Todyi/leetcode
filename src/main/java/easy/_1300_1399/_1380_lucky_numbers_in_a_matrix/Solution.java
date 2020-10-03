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

  public List<Integer> luckyNumbers(int[][] matrix) {
    int row = matrix.length, column = matrix[0].length;
    List<Integer> res = new ArrayList<>();

    for (int[] rowArr : matrix) {
      int columnIdx = 0, min = rowArr[0];
      for (int j = 1; j < column; j++) {
        if (rowArr[j] < min) {
          columnIdx = j;
          min = rowArr[j];
        }
      }
      boolean isMax = true;
      for (int j = 0; j < row; j++) {
        if (min < matrix[j][columnIdx]) {
          isMax = false;
          break;
        }
      }
      if (isMax) {
        res.add(min);
      }
    }
    return res;
  }

}
//leetcode submit region end(Prohibit modification and deletion)

