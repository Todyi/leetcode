package easy._600_699._657_robot_return_to_origin;

//There is a robot starting at position (0, 0), the origin, on a 2D plane.
// Given a sequence of its moves,
// judge if this robot ends up at (0, 0) after it completes its moves.
//
// The move sequence is represented by a string,
// and the character moves[i] represents its ith move.
// Valid moves are R (right), L (left), U (up), and D (down).
//If the robot returns to the origin after it finishes all of its moves,
// return true. Otherwise, return false.
//
// Note: The way that the robot is "facing" is irrelevant.
// "R" will always make the robot move to the right once,
// "L" will always make it move left, etc.
// Also, assume that the magnitude of the robot's movement is the same for each move.
//
// Example 1:
//
//
//Input: "UD"
//Output: true
//Explanation: The robot moves up once, and then down once.
// All moves have the same magnitude,
// so it ended up at the origin where it started. Therefore, we return true.
//
//
//
//
// Example 2:
//
//
//Input: "LL"
//Output: false
//Explanation: The robot moves left twice. It ends up two "moves" to the left of the origin.
// We return false because it is not at the origin at the end of its moves.
//
// Related Topics String


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:2 ms,击败了100.00% 的Java用户
  //  内存消耗:39.2 MB,击败了39.19% 的Java用户
  public boolean judgeCircle(String moves) {
    int[] map = new int[26];
    char[] arr = moves.toCharArray();
    for (char c : arr) {
      map[c - 'A']++;
    }
    return map['R' - 'A'] == map['L' - 'A'] && map['U' - 'A'] == map['D' - 'A'];
  }
}
//leetcode submit region end(Prohibit modification and deletion)

