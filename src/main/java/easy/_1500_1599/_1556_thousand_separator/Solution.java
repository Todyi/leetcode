package easy._1500_1599._1556_thousand_separator;

//Given an integer n, add a dot (".") as the thousands separator
// and return it in string format.
//
//
// Example 1:
//
//
//Input: n = 987
//Output: "987"
//
//
// Example 2:
//
//
//Input: n = 1234
//Output: "1.234"
//
//
// Example 3:
//
//
//Input: n = 123456789
//Output: "123.456.789"
//
//
// Example 4:
//
//
//Input: n = 0
//Output: "0"
//
//
//
// Constraints:
//
//
// 0 <= n < 2^31
//
// Related Topics String
// 👍 108 👎 8


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:36 MB,击败了6.61% 的Java用户
  public String thousandSeparator(int n) {
    if (0 == n) {
      return "0";
    }
    StringBuilder sb = new StringBuilder();
    int count = 0;
    while (0 < n) {
      sb.append(n % 10);
      count++;
      n /= 10;
      if (count == 3 && 0 < n) {
        count = 0;
        sb.append('.');
      }
    }

    return sb.reverse().toString();
  }
}
//leetcode submit region end(Prohibit modification and deletion)

