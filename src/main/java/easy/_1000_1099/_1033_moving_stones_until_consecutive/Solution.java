package easy._1000_1099._1033_moving_stones_until_consecutive;

//Three stones are on a number line at positions a, b, and c.
//
// Each turn, you pick up a stone at an endpoint (ie., either the lowest or highest position stone),
// and move it to an unoccupied position between those endpoints.
// Formally, let's say the stones are currently at positions x, y, z with x < y < z.
// You pick up the stone at either position x or position z,
// and move that stone to an integer position k, with x < k < z and k != y.
//
// The game ends when you cannot make any more moves, ie. the stones are in consecutive positions.
//
// When the game ends, what is the minimum and maximum number of moves that you could have made?
// Return the answer as an length 2 array: answer = [minimum_moves, maximum_moves]
//
//
//
// Example 1:
//
//
//Input: a = 1, b = 2, c = 5
//Output: [1,2]
//Explanation: Move the stone from 5 to 3, or move the stone from 5 to 4 to 3.
//
//
//
// Example 2:
//
//
//Input: a = 4, b = 3, c = 2
//Output: [0,0]
//Explanation: We cannot make any moves.
//
//
//
// Example 3:
//
//
//Input: a = 3, b = 5, c = 1
//Output: [1,2]
//Explanation: Move the stone from 1 to 4; or move the stone from 1 to 2 to 4.
//
//
//
//
//
//
// Note:
//
//
// 1 <= a <= 100
// 1 <= b <= 100
// 1 <= c <= 100
// a != b, b != c, c != a
//
//
//
//
//
//
//
//
//
// Related Topics Brainteaser
// 👍 85 👎 435


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:37 MB,击败了95.88% 的Java用户
  public int[] numMovesStones(int a, int b, int c) {
    if (a < b && b < c) {
      int min = 0, slot;
      if (2 < c - a) {
        min = 1;
        if (1 < (slot = Math.min(c - b, b - a))) {
          min = Math.min(slot - 1, 2);
        }
      }
      return new int[]{min, c - a - 2};
    } else {
      int max = Math.max(Math.max(a, b), c);
      int min = Math.min(Math.min(a, b), c);
      return numMovesStones(min, a + b + c - max - min, max);
    }
  }
}
//leetcode submit region end(Prohibit modification and deletion)

