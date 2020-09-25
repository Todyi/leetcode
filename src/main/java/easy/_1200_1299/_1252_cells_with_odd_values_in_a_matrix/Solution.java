package easy._1200_1299._1252_cells_with_odd_values_in_a_matrix;

//Given n and m which are the dimensions of a matrix initialized by zeros
// and given an array indices where indices[i] = [ri, ci].
// For each pair of [ri, ci] you have to increment all cells in row ri and column ci by 1.
//
// Return the number of cells with odd values in the matrix
// after applying the increment to all indices.
//
//
// Example 1:
//
//
//Input: n = 2, m = 3, indices = [[0,1],[1,1]]
//Output: 6
//Explanation: Initial matrix = [[0,0,0],[0,0,0]].
//After applying first increment it becomes [[1,2,1],[0,1,0]].
//The final matrix will be [[1,3,1],[1,3,1]] which contains 6 odd numbers.
//
//
// Example 2:
//
//
//Input: n = 2, m = 2, indices = [[1,1],[0,0]]
//Output: 0
//Explanation: Final matrix = [[2,2],[2,2]]. There is no odd number in the final
// matrix.
//
//
//
// Constraints:
//
//
// 1 <= n <= 50
// 1 <= m <= 50
// 1 <= indices.length <= 100
// 0 <= indices[i][0] < n
// 0 <= indices[i][1] < m
//
// Related Topics Array
// 👍 326 👎 523


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:1 ms,击败了90.90% 的Java用户
  //  内存消耗:37.3 MB,击败了86.38% 的Java用户
  int count = 0;

  public int oddCells(int n, int m, int[][] indices) {
    int[][] map = new int[n][m];
    for (int[] idx : indices) {
      addRow(idx[0], map);
      addColumn(idx[1], map);
    }
    return count;
  }

  public void addRow(int row, int[][] map) {
    for (int i = 0; i < map[row].length; i++) {
      map[row][i]++;
      if ((map[row][i] & 1) == 0) {
        count--;
      } else {
        count++;
      }
    }
  }

  public void addColumn(int column, int[][] map) {
    for (int i = 0; i < map.length; i++) {
      map[i][column]++;
      if ((map[i][column] & 1) == 0) {
        count--;
      } else {
        count++;
      }
    }
  }
}
//leetcode submit region end(Prohibit modification and deletion)

