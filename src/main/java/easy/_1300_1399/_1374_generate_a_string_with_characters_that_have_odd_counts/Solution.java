package easy._1300_1399._1374_generate_a_string_with_characters_that_have_odd_counts;

//Given an integer n, return a string with n characters such that each character
// in such string occurs an odd number of times.
//
// The returned string must contain only lowercase English letters. If there are
// multiples valid strings, return any of them.
//
//
// Example 1:
//
//
//Input: n = 4
//Output: "pppz"
//Explanation: "pppz" is a valid string since the character 'p' occurs three times
// and the character 'z' occurs once. Note that there are many other valid strings
// such as "ohhh" and "love".
//
//
// Example 2:
//
//
//Input: n = 2
//Output: "xy"
//Explanation: "xy" is a valid string since the characters 'x' and 'y' occur once.
// Note that there are many other valid strings such as "ag" and "ur".
//
//
// Example 3:
//
//
//Input: n = 7
//Output: "holasss"
//
//
//
// Constraints:
//
//
// 1 <= n <= 500
//
// Related Topics String
// 👍 120 👎 538


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:1 ms,击败了68.06% 的Java用户
  //  内存消耗:38.6 MB,击败了29.57% 的Java用户
  public String generateTheString(int n) {
    if (n == 0) {
      return "";
    }
    StringBuilder sb = new StringBuilder();
    int tmp = (n & 1) == 0 ? n - 1 : n;
    n -= tmp;
    while (0 < tmp--) {
      sb.append('a');
    }
    if (n == 1) {
      sb.append('b');
    }
    return sb.toString();
  }
}
//leetcode submit region end(Prohibit modification and deletion)

