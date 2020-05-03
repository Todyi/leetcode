package easy._201_400._263_ugly_number;

//Write a program to check whether a given number is an ugly number.
//
// Ugly numbers are positive numbers whose prime factors only include 2, 3, 5.
//
// Example 1:
//
//
//Input: 6
//Output: true
//Explanation: 6 = 2 × 3
//
// Example 2:
//
//
//Input: 8
//Output: true
//Explanation: 8 = 2 × 2 × 2
//
//
// Example 3:
//
//
//Input: 14
//Output: false
//Explanation: 14 is not ugly since it includes another prime factor 7.
//
//
// Note:
//
//
// 1 is typically treated as an ugly number.
// Input is within the 32-bit signed integer range: [−231, 231 − 1].
// Related Topics Math


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:2 ms,击败了10.83% 的Java用户
  //  内存消耗:38.6 MB,击败了6.25% 的Java用户
  public boolean isUgly(int num) {
    if (num == 1) {
      return true;
    }
    while (0 < num) {
      if (num % 2 == 0) {
        num = num >> 1;
        continue;
      } else if (num % 3 == 0) {
        num = num / 3;
        continue;
      } else if (num % 5 == 0) {
        num = num / 5;
        continue;
      } else {
        return num == 1;
      }
    }
    return false;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

