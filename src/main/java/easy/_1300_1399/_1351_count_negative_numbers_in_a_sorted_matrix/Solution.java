package easy._1300_1399._1351_count_negative_numbers_in_a_sorted_matrix;

//Given a m * n matrix grid which is sorted in non-increasing order both row-wise and column-wise.
//
// Return the number of negative numbers in grid.
//
//
// Example 1:
//
//
//Input: grid = [[4,3,2,-1],[3,2,1,-1],[1,1,-1,-2],[-1,-1,-2,-3]]
//Output: 8
//Explanation: There are 8 negatives number in the matrix.
//
//
// Example 2:
//
//
//Input: grid = [[3,2],[1,0]]
//Output: 0
//
//
// Example 3:
//
//
//Input: grid = [[1,-1],[-1,-1]]
//Output: 3
//
//
// Example 4:
//
//
//Input: grid = [[-1]]
//Output: 1
//
//
//
// Constraints:
//
//
// m == grid.length
// n == grid[i].length
// 1 <= m, n <= 100
// -100 <= grid[i][j] <= 100
// Related Topics Array Binary Search
// 👍 557 👎 33


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:39.1 MB,击败了99.88% 的Java用户
  public int countNegatives(int[][] grid) {
    int m = grid.length, n = grid[0].length, count = 0;
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        if (grid[i][j] < 0) {
          count += n - j;
          break;
        }
      }
    }
    return count;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

