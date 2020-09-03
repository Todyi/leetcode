package easy._1000_1099._1009_complement_of_base_10_integer;

//Every non-negative integer N has a binary representation.
// For example, 5 can be represented as "101" in binary, 11 as "1011" in binary, and so on.
// Note that except for N = 0, there are no leading zeroes in any binary representation.
//
// The complement of a binary representation is the number in binary you get
// when changing every 1 to a 0 and 0 to a 1.
// For example, the complement of "101" in binary is "010" in binary.
//
// For a given number N in base-10,
// return the complement of it's binary representation as a base-10 integer.
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
//Input: 5
//Output: 2
//Explanation: 5 is "101" in binary, with complement "010" in binary, which is 2
// in base-10.
//
//
//
// Example 2:
//
//
//Input: 7
//Output: 0
//Explanation: 7 is "111" in binary, with complement "000" in binary, which is 0 in base-10.
//
//
//
// Example 3:
//
//
//Input: 10
//Output: 5
//Explanation: 10 is "1010" in binary, with complement "0101" in binary, which is 5 in base-10.
//
//
//
//
// Note:
//
//
// 0 <= N < 10^9
// This question is the same as 476: https://leetcode.com/problems/number-complement/
//
//
//
//
// Related Topics Math
// 👍 256 👎 35


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:36.1 MB,击败了82.19% 的Java用户
  public int bitwiseComplement(int N) {
    if (N == 0) {
      return 1;
    }
    int res = 0, i = 0;
    while (0 < N) {
      res |= ((N & 1) ^ 1) << i;
      N >>= 1;
      i++;
    }
    return res;
  }
}
//leetcode submit region end(Prohibit modification and deletion)
