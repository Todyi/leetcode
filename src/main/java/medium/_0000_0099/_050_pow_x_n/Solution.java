package medium._0000_0099._050_pow_x_n;

//Implement pow(x, n), which calculates x raised to the power n (i.e. xn).
//
//
// Example 1:
//
//
//Input: x = 2.00000, n = 10
//Output: 1024.00000
//
//
// Example 2:
//
//
//Input: x = 2.10000, n = 3
//Output: 9.26100
//
//
// Example 3:
//
//
//Input: x = 2.00000, n = -2
//Output: 0.25000
//Explanation: 2-2 = 1/2^2 = 1/4 = 0.25
//
//
//
// Constraints:
//
//
// -100.0 < x < 100.0
// -2^31 <= n <= 2^31-1
// -10^4 <= x^n <= 10^4
//
// Related Topics Math Binary Search
// 👍 1854 👎 3376


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:37.1 MB,击败了8.13% 的Java用户
  public double myPow(double x, int n) {
    if (n == 0 || x == 1) {
      return 1;
    }
    if (n == Integer.MIN_VALUE) {
      x *= x;
      n /= 2;
    }
    if (n < 0) {
      x = 1 / x;
      n = -n;
    }
    return (n & 1) == 0 ? myPow(x * x, n / 2) : x * myPow(x * x, n / 2);
  }

}
//leetcode submit region end(Prohibit modification and deletion)

