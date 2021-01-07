package medium._0100_0199._120_triangle;

//Given a triangle array, return the minimum path sum from top to bottom.
//
// For each step, you may move to an adjacent number of the row below.
// More formally, if you are on index i on the current row,
// you may move to either index i or index i + 1 on the next row.
//
//
// Example 1:
//
//
//Input: triangle = [[2],[3,4],[6,5,7],[4,1,8,3]]
//Output: 11
//Explanation: The triangle looks like:
//   2
//  3 4
// 6 5 7
//4 1 8 3
//The minimum path sum from top to bottom is 2 + 3 + 5 + 1 = 11 (underlined above).
//
//
// Example 2:
//
//
//Input: triangle = [[-10]]
//Output: -10
//
//
//
// Constraints:
//
//
// 1 <= triangle.length <= 200
// triangle[0].length == 1
// triangle[i].length == triangle[i - 1].length + 1
// -104 <= triangle[i][j] <= 104
//
//
//
//Follow up: Could you do this using only O(n) extra space, where n is the total
// number of rows in the triangle? Related Topics Array Dynamic Programming
// 👍 2525 👎 293


import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:39.1 MB,击败了61.94% 的Java用户
  int[][] map;

  public int minimumTotal(List<List<Integer>> triangle) {
    map = new int[triangle.size()][triangle.get(triangle.size() - 1).size()];
    return minTotal(triangle, 0, 0);
  }

  public int minTotal(List<List<Integer>> triangle, int rowIdx, int idx) {
    if (triangle.size() <= rowIdx) {
      return 0;
    }
    if (map[rowIdx][idx] != 0) {
      return map[rowIdx][idx];
    }
    return map[rowIdx][idx] = triangle.get(rowIdx).get(idx) + Math
        .min(minTotal(triangle, rowIdx + 1, idx), minTotal(triangle, rowIdx + 1, idx + 1));
  }

}
//leetcode submit region end(Prohibit modification and deletion)

