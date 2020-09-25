package easy._1200_1299._1221_split_a_string_in_balanced_strings;

//Balanced strings are those who have equal quantity of 'L' and 'R' characters.
//
//
// Given a balanced string s split it in the maximum amount of balanced strings.
//
//
// Return the maximum amount of splitted balanced strings.
//
//
// Example 1:
//
//
//Input: s = "RLRRLLRLRL"
//Output: 4
//Explanation: s can be split into "RL", "RRLL", "RL", "RL",
// each substring contains same number of 'L' and 'R'.
//
//
// Example 2:
//
//
//Input: s = "RLLLLRRRLR"
//Output: 3
//Explanation: s can be split into "RL", "LLLRRR", "LR", each substring contains
// same number of 'L' and 'R'.
//
//
// Example 3:
//
//
//Input: s = "LLLLRRRR"
//Output: 1
//Explanation: s can be split into "LLLLRRRR".
//
//
// Example 4:
//
//
//Input: s = "RLRRRLLRLL"
//Output: 2
//Explanation: s can be split into "RL", "RRRLLRLL", since each substring contai
//ns an equal number of 'L' and 'R'
//
//
//
// Constraints:
//
//
// 1 <= s.length <= 1000
// s[i] = 'L' or 'R'
//
// Related Topics String Greedy
// 👍 687 👎 456


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:37.1 MB,击败了81.91% 的Java用户
  public int balancedStringSplit(String s) {
    char[] arr = s.toCharArray();
    int lNum = 0, rNum = 0, count = 0;
    for (char c : arr) {
      if (c == 'L') {
        lNum++;
      } else {
        rNum++;
      }
      if (lNum == rNum) {
        count++;
        lNum = 0;
        rNum = 0;
      }
    }
    return count;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

