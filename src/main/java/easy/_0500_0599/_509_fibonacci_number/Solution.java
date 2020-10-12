package easy._0500_0599._509_fibonacci_number;

//The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibon
//acci sequence, such that each number is the sum of the two preceding ones, start
//ing from 0 and 1. That is,
//
//
//F(0) = 0,   F(1) = 1
//F(N) = F(N - 1) + F(N - 2), for N > 1.
//
//
// Given N, calculate F(N).
//
//
//
// Example 1:
//
//
//Input: 2
//Output: 1
//Explanation: F(2) = F(1) + F(0) = 1 + 0 = 1.
//
//
// Example 2:
//
//
//Input: 3
//Output: 2
//Explanation: F(3) = F(2) + F(1) = 1 + 1 = 2.
//
//
// Example 3:
//
//
//Input: 4
//Output: 3
//Explanation: F(4) = F(3) + F(2) = 2 + 1 = 3.
//
//
//
//
// Note:
//
// 0 ≤ N ≤ 30.
// Related Topics Array


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:37.7 MB,击败了5.51% 的Java用户
  public int fib(int N) {
    int f0 = 0, f1 = 1;
    if (N == 0) {
      return f0;
    }
    if (N == 1) {
      return f1;
    }
    while (1 < N) {
      f1 += f0;
      f0 = f1 - f0;
      N--;
    }
    return f1;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

