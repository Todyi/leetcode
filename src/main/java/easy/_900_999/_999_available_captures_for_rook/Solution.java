package easy._900_999._999_available_captures_for_rook;

//On an 8 x 8 chessboard, there is one white rook. There also may be empty squares,
// white bishops, and black pawns. These are given as characters 'R', '.', 'B', and 'p' respectively.
// Uppercase characters represent white pieces, and lowercase characters represent black pieces.
//
// The rook moves as in the rules of Chess:
// it chooses one of four cardinal directions (north, east, west, and south),
// then moves in that direction until it chooses to stop,
// reaches the edge of the board,
// or captures an opposite colored pawn by moving to the same square it occupies.
// Also, rooks cannot move into the same square as other friendly bishops.
//
// Return the number of pawns the rook can capture in one move.
//
//
//
// Example 1:
//
//
//
//
//Input: [[".",".",".",".",".",".",".","."],[".",".",".","p",".",".",".","."],["
//.",".",".","R",".",".",".","p"],[".",".",".",".",".",".",".","."],[".",".",".","
//.",".",".",".","."],[".",".",".","p",".",".",".","."],[".",".",".",".",".",".","
//.","."],[".",".",".",".",".",".",".","."]]
//Output: 3
//Explanation:
//In this example the rook is able to capture all the pawns.
//
//
// Example 2:
//
//
//
//
//Input: [[".",".",".",".",".",".",".","."],[".","p","p","p","p","p",".","."],["
//.","p","p","B","p","p",".","."],[".","p","B","R","B","p",".","."],[".","p","p","
//B","p","p",".","."],[".","p","p","p","p","p",".","."],[".",".",".",".",".",".","
//.","."],[".",".",".",".",".",".",".","."]]
//Output: 0
//Explanation:
//Bishops are blocking the rook to capture any pawn.
//
//
// Example 3:
//
//
//
//
//Input: [[".",".",".",".",".",".",".","."],[".",".",".","p",".",".",".","."],["
//.",".",".","p",".",".",".","."],["p","p",".","R",".","p","B","."],[".",".",".","
//.",".",".",".","."],[".",".",".","B",".",".",".","."],[".",".",".","p",".",".","
//.","."],[".",".",".",".",".",".",".","."]]
//Output: 3
//Explanation:
//The rook can capture the pawns at positions b5, d6 and f5.
//
//
//
//
// Note:
//
//
// board.length == board[i].length == 8
// board[i][j] is either 'R', '.', 'B', or 'p'
// There is exactly one cell with board[i][j] == 'R'
//
// Related Topics Array
// 👍 229 👎 406


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:38.6 MB,击败了28.12% 的Java用户
  int x, y;

  public int numRookCaptures(char[][] board) {
    int count = 0;
    findRook(board);
    //west
    for (int i = x - 1; i > -1; i--) {
      if (board[y][i] == 'B') {
        break;
      } else if (board[y][i] == 'p') {
        count++;
        break;
      }
    }
    //north
    for (int i = y - 1; i > -1; i--) {
      if (board[i][x] == 'B') {
        break;
      } else if (board[i][x] == 'p') {
        count++;
        break;
      }
    }
    //east
    for (int i = x + 1; i < 8; i++) {
      if (board[y][i] == 'B') {
        break;
      } else if (board[y][i] == 'p') {
        count++;
        break;
      }
    }
    //south
    for (int i = y + 1; i < 8; i++) {
      if (board[i][x] == 'B') {
        break;
      } else if (board[i][x] == 'p') {
        count++;
        break;
      }
    }

    return count;
  }

  public void findRook(char[][] board) {
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board[i].length; j++) {
        if (board[i][j] == 'R') {
          x = j;
          y = i;
          return;
        }
      }
    }
  }
}
//leetcode submit region end(Prohibit modification and deletion)

