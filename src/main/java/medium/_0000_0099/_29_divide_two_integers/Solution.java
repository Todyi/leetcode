package medium._0000_0099._29_divide_two_integers;

//Given two integers dividend and divisor,
// divide two integers without using multiplication, division, and mod operator.
//
// Return the quotient after dividing dividend by divisor.
//
// The integer division should truncate toward zero, which means losing its fractional part.
// For example, truncate(8.345) = 8 and truncate(-2.7335) = -2.
//
// Note:
//
//
// Assume we are dealing with an environment that could only store integers with
//in the 32-bit signed integer range: [−2^31, 2^31 − 1]. For this problem,
// assume that your function returns 2^31 − 1 when the division result overflows.
//
//
//
// Example 1:
//
//
//Input: dividend = 10, divisor = 3
//Output: 3
//Explanation: 10/3 = truncate(3.33333..) = 3.
//
//
// Example 2:
//
//
//Input: dividend = 7, divisor = -3
//Output: -2
//Explanation: 7/-3 = truncate(-2.33333..) = -2.
//
//
// Example 3:
//
//
//Input: dividend = 0, divisor = 1
//Output: 0
//
//
// Example 4:
//
//
//Input: dividend = 1, divisor = 1
//Output: 1
//
//
//
// Constraints:
//
//
// -2^31 <= dividend, divisor <= 2^31 - 1
// divisor != 0
//
// Related Topics Math Binary Search
// 👍 1363 👎 5745


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:1 ms,击败了100.00% 的Java用户
  //  内存消耗:36.4 MB,击败了12.36% 的Java用户
  public int divide(int dividend, int divisor) {
    Long res = (long) dividend / (long) divisor;
    if (res < Integer.MIN_VALUE) {
      return Integer.MIN_VALUE;
    }
    if (Integer.MAX_VALUE < res) {
      return Integer.MAX_VALUE;
    }
    return res.intValue();
  }
}
//leetcode submit region end(Prohibit modification and deletion)

