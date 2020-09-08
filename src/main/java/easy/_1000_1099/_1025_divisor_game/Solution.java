package easy._1000_1099._1025_divisor_game;

//Alice and Bob take turns playing a game, with Alice starting first.
//
// Initially, there is a number N on the chalkboard. On each player's turn,
// that player makes a move consisting of:
//
//
// Choosing any x with 0 < x < N and N % x == 0.
// Replacing the number N on the chalkboard with N - x.
//
//
// Also, if a player cannot make a move, they lose the game.
//
// Return True if and only if Alice wins the game, assuming both players play optimally.
//
//
//
//
//
//
//
// Example 1:
//
//
//Input: 2
//Output: true
//Explanation: Alice chooses 1, and Bob has no more moves.
//
//
//
// Example 2:
//
//
//Input: 3
//Output: false
//Explanation: Alice chooses 1, Bob chooses 1, and Alice has no more moves.
//
//
//
//
// Note:
//
//
// 1 <= N <= 1000
//
//
// Related Topics Math Dynamic Programming
// 👍 490 👎 1349


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:2 ms,击败了29.09% 的Java用户
  //  内存消耗:35.9 MB,击败了93.06% 的Java用户
  public boolean divisorGame(int N) {
    boolean[] map = new boolean[N + 1];
    if (1 < N) {
      map[2] = true;
    }
    for (int i = 4; i <= N; i++) {
      for (int j = i - 1; 2 * j > i && j > 1; j--) {
        if (!map[j] && i % (i - j) == 0) {
          map[i] = true;
          break;
        }
      }
    }
    return map[N];
  }
}
//leetcode submit region end(Prohibit modification and deletion)

