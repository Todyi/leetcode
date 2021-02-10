package medium._0200_0299._201_bitwise_and_of_numbers_range;

//Given a range [m, n] where 0 <= m <= n <= 2147483647,
// return the bitwise AND of all numbers in this range, inclusive.
//
// Example 1:
//
//
//Input: [5,7]
//Output: 4
//
//
// Example 2:
//
//
//Input: [0,1]
//Output: 0 Related Topics Bit Manipulation
// 👍 1272 👎 141


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:5 ms,击败了48.27% 的Java用户
  //  内存消耗:38.1 MB,击败了84.98% 的Java用户
  public int rangeBitwiseAnd(int m, int n) {
    int result = 0, mask = 1 << 30;
    while (0 < mask && (m & mask) == (n & mask)) {
      result |= m & mask;
      mask >>= 1;
    }
    return result;
  }
}
//leetcode submit region end(Prohibit modification and deletion)
