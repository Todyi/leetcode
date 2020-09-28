package easy._1300_1399._1317_convert_integer_to_the_sum_of_two_no_zero_integers;

//Given an integer n.
// No-Zero integer is a positive integer which doesn't contain any 0 in its decimal representation.
//
// Return a list of two integers [A, B] where:
//
//
// A and B are No-Zero integers.
// A + B = n
//
//
// It's guarateed that there is at least one valid solution.
// If there are many valid solutions you can return any of them.
//
//
// Example 1:
//
//
//Input: n = 2
//Output: [1,1]
//Explanation: A = 1, B = 1. A + B = n
// and both A and B don't contain any 0 in their decimal representation.
//
//
// Example 2:
//
//
//Input: n = 11
//Output: [2,9]
//
//
// Example 3:
//
//
//Input: n = 10000
//Output: [1,9999]
//
//
// Example 4:
//
//
//Input: n = 69
//Output: [1,68]
//
//
// Example 5:
//
//
//Input: n = 1010
//Output: [11,999]
//
//
//
// Constraints:
//
//
// 2 <= n <= 10^4
// Related Topics Math
// 👍 120 👎 122


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:37 MB,击败了87.59% 的Java用户
  public int[] getNoZeroIntegers(int n) {
    int a = n / 2;
    while (true) {
      if (intWithNoZero(a) && intWithNoZero(n - a)) {
        return new int[]{a, n - a};
      }
      a += 1;
    }
  }

  public boolean intWithNoZero(int n) {
    while (0 < n) {
      if (n % 10 == 0) {
        return false;
      }
      n /= 10;
    }
    return true;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

