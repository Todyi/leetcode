package easy._1200_1299._1275_find_winner_on_a_tic_tac_toe_game;

//Tic-tac-toe is played by two players A and B on a 3 x 3 grid.
//
// Here are the rules of Tic-Tac-Toe:
//
//
// Players take turns placing characters into empty squares (" ").
// The first player A always places "X" characters,
// while the second player B always places "O" characters.
// "X" and "O" characters are always placed into empty squares, never on filled ones.
// The game ends when there are 3 of the same (non-empty) character filling any row, column,
// or diagonal.
// The game also ends if all squares are non-empty.
// No more moves can be played if the game is over.
//
//
// Given an array moves where each element is another array of size 2
// corresponding to the row and column of the grid
// where they mark their respective character in the order in which A and B play.
//
// Return the winner of the game if it exists (A or B),
// in case the game ends in a draw return "Draw",
// if there are still movements to play return "Pending".
//
// You can assume that moves is valid (It follows the rules of Tic-Tac-Toe),
// the grid is initially empty and A will play first.
//
//
// Example 1:
//
//
//Input: moves = [[0,0],[2,0],[1,1],[2,1],[2,2]]
//Output: "A"
//Explanation: "A" wins, he always plays first.
//"X  "    "X  "    "X  "    "X  "    "X  "
//"   " -> "   " -> " X " -> " X " -> " X "
//"   "    "O  "    "O  "    "OO "    "OOX"
//
//
// Example 2:
//
//
//Input: moves = [[0,0],[1,1],[0,1],[0,2],[1,0],[2,0]]
//Output: "B"
//Explanation: "B" wins.
//"X  "    "X  "    "XX "    "XXO"    "XXO"    "XXO"
//"   " -> " O " -> " O " -> " O " -> "XO " -> "XO "
//"   "    "   "    "   "    "   "    "   "    "O  "
//
//
// Example 3:
//
//
//Input: moves = [[0,0],[1,1],[2,0],[1,0],[1,2],[2,1],[0,1],[0,2],[2,2]]
//Output: "Draw"
//Explanation: The game ends in a draw since there are no moves to make.
//"XXO"
//"OOX"
//"XOX"
//
//
// Example 4:
//
//
//Input: moves = [[0,0],[1,1]]
//Output: "Pending"
//Explanation: The game has not finished yet.
//"X  "
//" O "
//"   "
//
//
//
// Constraints:
//
//
// 1 <= moves.length <= 9
// moves[i].length == 2
// 0 <= moves[i][j] <= 2
// There are no repeated elements on moves.
// moves follow the rules of tic tac toe.
// Related Topics Array
// 👍 211 👎 78


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:36.3 MB,击败了100.00% 的Java用户
  public String tictactoe(int[][] moves) {
    if (moves.length < 5) {
      return "Pending";
    }
    Character[][] map = new Character[3][3];
    boolean a = true;
    for (int[] move : moves) {
      map[move[0]][move[1]] = a ? 'A' : 'B';
      a = !a;
    }
    for (int i = 0; i < 3; i++) {
      if (checkWin(map[i][0], map[i][1], map[i][2])) {
        return String.valueOf(map[i][0]);
      }
      if (checkWin(map[0][i], map[1][i], map[2][i])) {
        return String.valueOf(map[0][i]);
      }
    }
    if (checkWin(map[0][0], map[1][1], map[2][2])) {
      return String.valueOf(map[1][1]);
    }
    if (checkWin(map[0][2], map[1][1], map[2][0])) {
      return String.valueOf(map[1][1]);
    }
    return moves.length == 9 ? "Draw" : "Pending";
  }

  public boolean checkWin(Character p0, Character p1, Character p2) {
    return p0 != null && p0.equals(p1) && p0.equals(p2);
  }
}
//leetcode submit region end(Prohibit modification and deletion)

