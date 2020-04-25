package easy._172_factorial_trailing_zeroes;

//Given an integer n, return the number of trailing zeroes in n!.
//
// Example 1:
//
//
//Input: 3
//Output: 0
//Explanation: 3! = 6, no trailing zero.
//
// Example 2:
//
//
//Input: 5
//Output: 1
//Explanation: 5! = 120, one trailing zero.
//
// Note: Your solution should be in logarithmic time complexity.
// Related Topics Math


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:36.7 MB,击败了7.69% 的Java用户
  public int trailingZeroes(int n) {
    int zero = 0;
    while (0 < n) {
      n = n / 5;
      zero += n;
    }
    return zero;

//    if (n == 0) {
//      return 0;
//    }
//    return n / 5 + trailingZeroes(n / 5);
  }

}
//leetcode submit region end(Prohibit modification and deletion)

