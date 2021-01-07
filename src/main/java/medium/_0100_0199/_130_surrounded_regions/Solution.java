package medium._0100_0199._130_surrounded_regions;

//Given a 2D board containing 'X' and 'O' (the letter O), capture all regions surrounded by 'X'.
//
// A region is captured by flipping all 'O's into 'X's in that surrounded region.
//
// Example:
//
//
//X X X X
//X O O X
//X X O X
//X O X X
//
//
// After running your function, the board should be:
//
//
//X X X X
//X X X X
//X X X X
//X O X X
//
//
// Explanation:
//
// Surrounded regions shouldn’t be on the border, which means that any 'O' on th
//e border of the board are not flipped to 'X'. Any 'O' that is not on the border
//and it is not connected to an 'O' on the border will be flipped to 'X'. Two cell
//s are connected if they are adjacent cells connected horizontally or vertically.
//
// Related Topics Depth-first Search Breadth-first Search Union Find
// 👍 2379 👎 733


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:40.9 MB,击败了75.40% 的Java用户
  int rows, columns;

  public void solve(char[][] board) {
    rows = board.length;
    if (rows == 0) {
      return;
    }
    columns = board[0].length;
    if (columns == 0) {
      return;
    }

    for (int i = 0; i < rows; i++) {
      if (board[i][0] == 'O') {
        solve(board, i, 0);
      }
      if (board[i][columns - 1] == 'O') {
        solve(board, i, columns - 1);
      }
    }
    for (int i = 0; i < columns; i++) {
      if (board[0][i] == 'O') {
        solve(board, 0, i);
      }
      if (board[rows - 1][i] == 'O') {
        solve(board, rows - 1, i);
      }
    }

    replace(board, 'O', 'X');

    replace(board, '-', 'O');
  }

  public void solve(char[][] board, int i, int j) {
    if (i < 0 || rows <= i || j < 0 || columns <= j
        || board[i][j] == 'X' || board[i][j] == '-') {
      return;
    }
    board[i][j] = '-';
    solve(board, i, j - 1);
    solve(board, i, j + 1);
    solve(board, i - 1, j);
    solve(board, i + 1, j);
  }

  public void replace(char[][] board, char s, char t) {
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < columns; j++) {
        if (board[i][j] == s) {
          board[i][j] = t;
        }
      }
    }
  }
}
//leetcode submit region end(Prohibit modification and deletion)

