package medium._0000_0099._036_valid_sudoku;

//Determine if a 9 x 9 Sudoku board is valid.
// Only the filled cells need to be validated according to the following rules:
//
//
// Each row must contain the digits 1-9 without repetition.
// Each column must contain the digits 1-9 without repetition.
// Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 with
//out repetition.
//
//
// Note:
//
//
// A Sudoku board (partially filled) could be valid but is not necessarily solva
//ble.
// Only the filled cells need to be validated according to the mentioned rules.
//
//
//
//
// Example 1:
//
//
//Input: board =
//[["5","3",".",".","7",".",".",".","."]
//,["6",".",".","1","9","5",".",".","."]
//,[".","9","8",".",".",".",".","6","."]
//,["8",".",".",".","6",".",".",".","3"]
//,["4",".",".","8",".","3",".",".","1"]
//,["7",".",".",".","2",".",".",".","6"]
//,[".","6",".",".",".",".","2","8","."]
//,[".",".",".","4","1","9",".",".","5"]
//,[".",".",".",".","8",".",".","7","9"]]
//Output: true
//
//
// Example 2:
//
//
//Input: board =
//[["8","3",".",".","7",".",".",".","."]
//,["6",".",".","1","9","5",".",".","."]
//,[".","9","8",".",".",".",".","6","."]
//,["8",".",".",".","6",".",".",".","3"]
//,["4",".",".","8",".","3",".",".","1"]
//,["7",".",".",".","2",".",".",".","6"]
//,[".","6",".",".",".",".","2","8","."]
//,[".",".",".","4","1","9",".",".","5"]
//,[".",".",".",".","8",".",".","7","9"]]
//Output: false
//Explanation: Same as Example 1, except with the 5 in the top left corner being
// modified to 8. Since there are two 8's in the top left 3x3 sub-box, it is invalid.
//
//
//
// Constraints:
//
//
// board.length == 9
// board[i].length == 9
// board[i][j] is a digit or '.'.
//
// Related Topics Hash Table
// 👍 1974 👎 489


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:1 ms,击败了100.00% 的Java用户
  //  内存消耗:39.1 MB,击败了9.29% 的Java用户
  public boolean isValidSudoku(char[][] board) {
    for (int i = 0; i < 9; i++) {
      if (!isValidRow(board[i])) {
        return false;
      }
      if (!isValidColumn(board, i)) {
        return false;
      }
    }
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        if (!isValidSubBox(board, i * 3, j * 3)) {
          return false;
        }
      }
    }
    return true;
  }

  public boolean isValidRow(char[] row) {
    boolean[] map = new boolean[10];
    for (char c : row) {
      if (c == '.') {
        continue;
      }
      if (map[c - '0']) {
        return false;
      }
      map[c - '0'] = true;
    }
    return true;
  }

  public boolean isValidColumn(char[][] board, int column) {
    boolean[] map = new boolean[10];
    for (int i = 0; i < board.length; i++) {
      char c = board[i][column];
      if (c == '.') {
        continue;
      }
      if (map[c - '0']) {
        return false;
      }
      map[c - '0'] = true;
    }
    return true;
  }

  public boolean isValidSubBox(char[][] board, int row, int column) {
    boolean[] map = new boolean[10];
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        char c = board[row + i][column + j];
        if (c == '.') {
          continue;
        }
        if (map[c - '0']) {
          return false;
        }
        map[c - '0'] = true;
      }
    }
    return true;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

